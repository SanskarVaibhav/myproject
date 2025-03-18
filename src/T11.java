
import java.util.*;


public class T11 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
     
// create a function to create a queue with queue1 and queue2 is print alternate
public void interleave(Queue<Integer> q1,Queue<Integer> q2){
    Queue<Integer> result = new LinkedList<>();
    while (!q1.isEmpty() && !q2.isEmpty()){
        result.add(q1.poll());
        result.add(q2.poll());
    }
    while(!q1.isEmpty()){
        result.add(q1.poll());
    }
    while(!q2.isEmpty()){
        result.add(q2.poll());
    }

    while(!result.isEmpty()){
        System.out.print(result.poll()+" ");
    }
}
public static void main(String[] args) {
    T11 q =new T11();
    q.q1.add(1);
    q.q1.add(2);
    q.q1.add(3);
    q.q1.add(4);

    q.q2.add(5);
    q.q2.add(6);
    q.q2.add(7);
    q.q2.add(8);
    System.out.print("queue after applying interleave : ");
    q.interleave(q.q1, q.q2);
}
}
