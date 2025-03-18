print("Hello World")
print("Hello")
print("World")
print("Hello")
print("   world")
def calculate_difference(num):
    diff = num - 17
    if num > 17:
        return 2 * abs(diff)
    else:
        return diff

# Test the function with a sample number
num = 20
result = calculate_difference(num)
print(f"The difference between {num} and 17 is {result}")
num = 16
result = calculate_difference(num)
print(f"The difference between {num} and 17 is {result}")
x='hello'
print(x)
a='sanksar'
b='vaibhav'
print("Name is",a+" "+b)
# Declare and assign values to variables
name = "NIKUNJ BANSAL"
roll_no = 500069944
dob = "13 Oct 1999"
address = '''Galgotias University 
           Greater Noida '''
pincode = 123456
programme = "AI & ML"
semester = 2

# Print the values in the desired format
print(f"NAME : {name}")
print(f"ROLL NO : {roll_no}")
print(f"DATE OF BIRTH : {dob}")
print(f"ADDRESS : {address}\nPincode : {pincode}")
print(f"Programme : {programme}\nSemester : {semester}")
radius=int(input("Radius is "))
c=3.18*radius*radius
print("Area of circle is : ",c)
x=int(input("value of x is "))
y=int(input("value of y is "))
print((x+y)**2)