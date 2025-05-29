import java.util.*;
public class T2 
{
public static void main(String[] args) 
{
  Scanner sc =new Scanner(System.in);
  System.out.print("no. of elements in array : ");
  int n=sc.nextInt();
  System.out.print("array is : ");
  int [] arr=new int[n]; 
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  } 
  //minimum and maximum
  int max=arr[0]; //initialize arr[0] as max in the start
int min=arr[0]; //initialize arr[0] as min in the start
  for (int i=0;i<n;i++)
  {
    //condition to find  maximum in an array
    if(arr[i]>max)
    {
        max=arr[i];
    }
    //condition to find  minimum in an array
    if(arr[i]<min)
    {
        min=arr[i];
    }
  }
  System.out.print("max number : ");
  System.out.println(max);
  System.out.print("min number : ");
  System.out.println(min);
} 
}
