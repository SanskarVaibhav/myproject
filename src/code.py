from collections import deque

def min_moves_to_reach_destination(M, N, grid, source, destination, move_rule):
    # Extract source and destination coordinates
    src_x, src_y = source
    dest_x, dest_y = destination
    dx, dy = move_rule
    
    # Define possible moves based on move_rule
    moves = [
        (dx, dy),         # Forward
        (dy, -dx),        # Right (90 degrees clockwise rotation)
        (-dy, dx),        # Left (90 degrees counterclockwise rotation)
        (-dx, -dy)        # Backward (180 degrees rotation)
    ]
    
    # BFS initialization
    queue = deque([(src_x, src_y, 0)])  # (x, y, moves_count)
    visited = set()
    visited.add((src_x, src_y))
    
    # BFS loop
    while queue:
        x, y, moves_count = queue.popleft()
        
        # Check if we've reached the destination
        if (x, y) == (dest_x, dest_y):
            return moves_count
        
        # Explore all 4 possible moves
        for mx, my in moves:
            new_x, new_y = x + mx, y + my
            
            # Check bounds and if cell is passable and unvisited
            if 0 <= new_x < M and 0 <= new_y < N and grid[new_x][new_y] == 0 and (new_x, new_y) not in visited:
                visited.add((new_x, new_y))
                queue.append((new_x, new_y, moves_count + 1))
    
    # If we exhaust the queue without finding the destination
    return -1

# Example Usage
M, N = 6, 6
grid = [
    [0, 1, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 1],
    [0, 1, 0, 0, 0, 0],
    [1, 1, 0, 0, 0, 1],
    [0, 0, 0, 0, 0, 0],
    [1, 1, 0, 0, 1, 0]
]
source = (1, 0)
destination = (5, 3)
move_rule = (1, 2)

print(min_moves_to_reach_destination(M, N, grid, source, destination, move_rule))
