public class T6 {

  Node head;
  private int size;

    public T6() {
        size=0;
    }

public class Node{
    int data;
    Node next;

    Node(int data) {
        this.data=data;
        this.next=null;
        }
    }

    // function to check linkedlist is circular or not  using two pointer approach

    public boolean iscycle(){
        // take two pointer slow and fast at the head 
            Node slow = head; 
            Node fast = head;
            // check coindition fast != null and fast.next !=null then move slow pointer by one and fast pointer by two 
            while(fast != null &&  fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
                // if slow is equal to fast then linked is circular else not  
                if(slow == fast){
                    return true;
                }
            }
            return false;
        
    }

    // add data in  linkedlist at the starting position
public void addFirst(int data){
    Node newNode = new Node(data); // first create a newnode in LL
    newNode.next=head; // initilize newnode.next as head
    head = newNode; // store newnode data in the head node 
    size++; // increment size of the LL 
}
 
// add data in  linkedlist at the last position
public void addLast(int data){
    Node newNode = new Node(data); // first create a newnode in LL
    // if head node is null simply initilize newnode as head and return
    if(head == null){
        head = newNode;
        return;
    }

    Node lastNode = head; // else initilize lastnode as head 
    // while lastnode.next != null then store lastnode.next in lastnode
   while(lastNode.next != null){
    lastNode =lastNode.next;
   }

   lastNode.next=newNode; // store newnode data in lastnode.next
   size++; // increment size of the LL 
}

// add data in  linkedlist at the middle position in any index
public void addInMiddle(int index, int data) {
    // if index is less than 0 or index is greater than size then index value is invalid
    if (index > size || index < 0) {
        System.out.println("Invalid Index value");
        return;
    }

    Node newNode = new Node(data); // first create a newnode in LL
    // if index is at 0 simply imply newnode.next as head and store newnode data in head
    if (index == 0) {
        newNode.next = head;
        head = newNode;
    } else {
        Node currNode = head; // create a currnode and imply as head
        for (int i = 1; i < index; i++) {
            currNode = currNode.next; 
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    size++;
}
// create a print function 
public void printList(){
    Node currNode = head; // imply currnode as head
    // while currnode!= null print currnode data and then store currnode.next in currnode
    while(currNode != null){
        System.out.print(currNode.data+" -> ");
        currNode = currNode.next;
    }
System.out.println("null");
}
// create a function to remove data from firstnode
public void removefirst(){
    
    if (head== null){
        System.out.println("Empty Linkedlist ");
        return;
    }

    head = head.next; // simply point head.next as head
    size--; // decrement size of the LL
}

// create a function to remove last node data
public void removelast(){
    if (head == null){
        System.out.println("Empty list ");
        return;
    }

    if(head.next == null){
        head =null;
    }
    

    Node currNode =head;
    Node lastNode = head.next;

    while (lastNode.next != null) {
        currNode = currNode.next;
        lastNode = lastNode.next;
    }
    
    currNode.next=null;
    size--;
}

public int getSize(){
     System.out.print("linkedlist size is " );
     return size;
}
// create a reverse function 

public void reverse()
{
    Node prev = null; 
    Node currNode = head ;
    Node Next;

    while(currNode != null){
        Next = currNode.next;
        currNode.next=prev;


        prev= currNode;
        currNode = Next;
    }
    head = prev;
}

// create a function to remove data from nth position
public void removeNth(int n) {
    if (n > size || n < 1) {
        System.out.println("Invalid position");
        return;
    }
    size--;
    if (n == 1) {
        head = head.next;
        return;
    }
    Node currNode = head;
    for (int i = 1; i < n - 1; i++) {
        currNode = currNode.next;
    }
    currNode.next = currNode.next.next;
}

// create a function to make LL circular from any index
public void createCycle(int index) {
    if (index < 0 || index >= size) {
        System.out.println("Invalid index for cycle creation");
        return;
    }

    Node cycleNode = head;
    for (int i = 0; i < index; i++) {
        cycleNode = cycleNode.next;
    }

    Node lastNode = head;
    while (lastNode.next != null) {
        lastNode = lastNode.next;
    }

    lastNode.next = cycleNode; // Creating the cycle
    System.out.println("Cycle created at index: " + index);
}

// create a function to remove cycle from LL
public Node removeCycle(){
    Node slow = head;
    Node fast = head;
    while(fast != null &&  fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            break;
        }
    }
    if(slow==fast){
           slow = head;
           Node prev=null;
           while(slow != fast){
               prev=fast;
               slow=slow.next;
               fast=fast.next;
           }
           prev.next=null;
        }
     return head;
   
}
public static void main(String[] args) {
    T6 list = new T6();
    list.addFirst(1);
    list.addLast(2);
    list.addLast(3);
    System.out.print("LL is created : ");
    list.printList();
    list.addFirst(5);
    System.out.print("new LL is created : ");
    list.printList();
    System.out.println(list.getSize());
    list.removefirst();
    System.out.print("LL after removing firstnode data : "); 
    list.printList();
    list.addInMiddle(3, 4);
    System.out.print("LL after adding 4 at  3rd index : "); 
    list.printList();
    System.out.println(list.getSize());
    list.reverse();
    System.out.print("LL is reversed : ");
   list.printList();
   list.createCycle(1);
   System.out.println("Cycle is created "+list.iscycle());
   list.removeCycle();
   System.out.print("Cycle is removed : ");
   list.printList();

}
}
