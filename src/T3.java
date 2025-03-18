import java.util.Scanner;

public class T3 {
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
//reverse an array using two pointer method 
  int i=0; // i pointer is at starting index 
  int j=n-1; // j pointer is at arr.length-1 index 

  // swap arr[i] and arr[j] till i<j using third variable 
  while(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++; // increment i pointer
    j--; // decrement j pointer
  }
  System.out.print("Reverse array is : ");
  for(int x=0;x<n;x++){
    System.out.print(arr[x]+ " ");
  }

    }
}
