import java.util.*;

public class T8 {
    // creare a function to find next greater integrer to the current integer
    public void nextGreater(int arr[]){
        Stack<Integer> st =new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.println(arr[i]+"-> -1");
            }
            else{
                System.out.println(arr[i]+"->"+st.peek());
            }
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of elements in array : ");
          int n=sc.nextInt();  
          System.out.print("array is : ");
          int [] arr=new int[n];
          for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          } 
          T8 t =new T8();
          System.out.println("Next greater integer is : ");
          t.nextGreater(arr);
    }

}
