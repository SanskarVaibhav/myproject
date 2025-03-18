class linkedlist
{ 
    static class Node 
    { 
        int data; 
        Node next; 
    } 
      static Node freeList(Node node) 
    { 
        while (node != null) 
        { 
            Node next = node.next; 
            node = next; 
        } 
        return node; 
    } 
    static Node deleteKthNode(Node head,int k) 
    { 
        if (head == null) 
            return null; 
    
        if (k == 1) 
        { 
            head = freeList(head); 
            return null; 
        } 
      Node ptr = head, prev = null; 
        int count = 0; 
        while (ptr != null) 
        { 
            
            count++; 

            if (k == count) 
            { 
                
                prev.next = ptr.next; 
    
               
                count = 0; 
            } 
    
            
            if (count != 0) 
                prev = ptr; 
    
            ptr = prev.next; 
        } 
        return head; 
    } 
    
  
    static void displayList(Node head) 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
            System.out.print(temp.data + 
                            " "); 
            temp = temp.next; 
        } 
    } 
    
  
    static Node newNode(int x) 
    { 
        Node temp = new Node(); 
        temp.data = x; 
        temp.next = null; 
        return temp; 
    } 
    

    public static void main(String args[]) 
    { 
        Node head = newNode(1); 
        head.next = newNode(2); 
        head.next.next = newNode(3); 
        head.next.next.next = newNode(4); 
        head.next.next.next.next = 
        newNode(5); 
        head.next.next.next.next.next = 
        newNode(6); 
        head.next.next.next.next.next.next = 
        newNode(7); 
        head.next.next.next.next.next.next.next = 
        newNode(8); 
    
        int k = 3; 
        head = deleteKthNode(head, k); 
    
        displayList(head); 
    } 
    } 
   
    