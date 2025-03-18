
import java.util.*;

public class T10 {

    Stack<Integer>s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
// add data in the queue
    public void enqueue(int data){
        s1.push(data);
    }
// remove data in the queue
    public int dequeue(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }

public static void main(String[] args) {
    T10 q = new T10();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());

}
}
