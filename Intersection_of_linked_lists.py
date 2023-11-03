class Node:

    def __init__(self,val):

        self.val = val
        self.next = None

class LinkedList:   
    def __init__(self):

        self.head = None
    
    def insert(self,val):
        if self.head == None:
            self.head = Node(val)
            return
        current = self.head
        new_node = Node(val)
        while current:
            if current.next == None:
                current.next = new_node
                return
            current = current.next
        
    def display(self):
        current = self.head
        while current:
            print(current.val,end=" ")
            current = current.next

    def merge1(self,x,z):

        current1 = self.head
        for i in range(x):
            current1=current1.next
        return current1.val

    def merge2(self,y,z):
        current2 = self.head
        for i in range(y):
            current2=current2.next
        return current2.val

l1=[4,1,8,4,5]
l2=[5,6,1,8,4,5]

lst1=LinkedList()
lst2=LinkedList()
for i in l1:
    lst1.insert(i)

for i in l2:
    lst2.insert(i)

z=int(input("IntersectVal -"))
x=int(input("skipA- "))
y=int(input("skipB- "))

lst1.display()
print()
lst2.display()
print()
point1=lst1.merge1(x,z)
point2=lst2.merge1(y,z)

if point1==point2:
    print("Intersected at",z)
else:
    print("Not intersect")

