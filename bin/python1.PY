list1=[1,2,3,4,5,6,7,8,9]
list2=["apple","mango","orange","watermelon"]
print(list1)
print(list1[1:5])
print(list1[:7])
print(list1[4:])
print("The length of the list is ", len(list1))
print("The length of the list is ", len(list2))
print(list2[1:3])
print(list1[1:-1])
list2[1]="banana"
print(list2)
list2.insert(1,"mango")
print(list2)
list1.extend(list2)
print(list1)
list2.remove("mango")
print(list2)
list2.pop(1)
print(list2)
for x in list2:
    print(x)
i=0
while i < len(list1):
    print(list1[i])
    i=i+1
    list3=[]
for x in list2:
  if "apple" in x:
    list3.append(x)
print(list3)
list2.sort()
print(list2)
list2.sort(reverse = True)
print(list2)
list2.reverse()
print(list2)
list4=list1+list2
print(list4)
