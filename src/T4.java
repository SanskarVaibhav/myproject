import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
System.out.print("no. of elements in array : ");
  int n=sc.nextInt();  
  System.out.print("array is : ");
  int [] arr=new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  } 

  // array after all the zeros at the end without changing the order 

  int j=0; //  initilize j pointer at the starting index

  // store arr[i] in arr[j] for  arr[i]!= 0 and increment j pointer by one in a for loop till i<arr.length
  for(int i=0;i<n;i++){
    if(arr[i]!=0)
    {
        arr[j]=arr[i];
        j++;
    }
  }
  
  // when all arr[i]!= 0 is stored in the array then simply store 0 in the remaining left index
  while(j<n)
    {
        arr[j]=0;
        j++;
    }
  System.out.print("array after all zeros at end : ");
  for(int x=0;x<n;x++)
  {
    System.out.print(arr[x]+" ");
  }
    }
}
