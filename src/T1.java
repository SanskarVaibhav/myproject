import java.util.*;

public class T1 {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print ("two numbers is : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

// with using third variable 
        int temp=a;
        a=b;
        b=temp;
        
        System.out.print("After Swapping two numbers using third variable -> ");
        System.out.println("a -> "+a+" , "+"b -> "+b);
        
//without using third variable
         b=a-b;
         a=a+b;
         a=a-b;

         System.out.print("After Swapping two numbers without using third variable -> ");
        System.out.println("a -> " + a + " , " + "b -> " + b);
    } // End of main method
} // End of class T1

}

 // End of class T1
