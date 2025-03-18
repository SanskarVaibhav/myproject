
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lines_intersect(line1, line2):
    """ Check if two lines intersect and return the intersection point if they do. """
    (x1, y1), (x2, y2) = line1
    (x3, y3), (x4, y4) = line2

    denom = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4)
    if denom == 0:
        return None  
    intersect_x = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denom
    intersect_y = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denom

    if (min(x1, x2) <= intersect_x <= max(x1, x2) and
        min(y1, y2) <= intersect_y <= max(y1, y2) and
        min(x3, x4) <= intersect_x <= max(x3, x4) and
        min(y3, y4) <= intersect_y <= max(y3, y4)):
        return (int(intersect_x), int(intersect_y))

    return None

def calculate_voltage(wires):
    intersection_map = {}
    for i in range(len(wires)):
        for j in range(i + 1, len(wires)):
            intersect_point = lines_intersect(wires[i], wires[j])
            if intersect_point:
                if intersect_point not in intersection_map:
                    intersection_map[intersect_point] = []
                intersection_map[intersect_point].append((i, j))

    total_voltage = 0
    for point, wire_pairs in intersection_map.items():
        wires_at_point = set()
        min_cells = float('inf')

        for i, j in wire_pairs:
            wires_at_point.add(i)
            wires_at_point.add(j)
            (x1, y1), (x2, y2) = wires[i]
            (x3, y3), (x4, y4) = wires[j]

            
            if x1 == x2:  
                cells_left = abs(y1 - point[1]) - 1
                cells_right = abs(y2 - point[1]) - 1
            else:  
                cells_left = abs(x1 - point[0]) - 1
                cells_right = abs(x2 - point[0]) - 1

            min_cells = min(min_cells, cells_left, cells_right)

        voltage = len(wires_at_point) * min_cells
        total_voltage += voltage

    return total_voltage

def solve():
    import sys
    input = sys.stdin.read
    data = input().splitlines()

    N = int(data[0])  
    wires = []
    for i in range(1, N + 1):
        x1, y1, x2, y2 = map(int, data[i].split())
        wires.append(((x1, y1), (x2, y2)))

    animal_thresholds = {}
    animal_data = data[N + 1].strip().split()
    for entry in animal_data:
        animal, threshold = entry.split(':')
        animal_thresholds[animal] = int(threshold)

    touched_animal = data[N + 2].strip()

    total_voltage = calculate_voltage(wires)
    
    
    animal_voltage_threshold = animal_thresholds[touched_animal]
    if total_voltage >= animal_voltage_threshold:
        print("Yes")
    else:
        print("No")

    
    count_dying_animals = sum(1 for threshold in animal_thresholds.values() if total_voltage >= threshold)
    total_animals = len(animal_thresholds)
    probability = count_dying_animals / total_animals if total_animals > 0 else 0
    print(f"{probability:.2f}")

