import java.util.Scanner;

public class T5 {

   /*  // binary search 
   int binarysearch(int arr[],int key)
    {
      int low=0;
      int high=n-1;
      while(low<=high){
          int mid=(low+high)/2;
          if(arr[mid]=key){
              return mid;
          }
          elseif(arr[mid]<key)
          {
              low=mid+1;
          }
          else(arr[mid]>key)
          {
              high=mid-1;
          }
      }
    }
      */
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

  // sorting 0,1 and 2 in an array or sort color 

  // take three pointers low, mid and high 
 
 int low=0; // place pointer low at 0 index
 int mid=0; // place pointer mid also at 0 index
 int high=n-1; // place pointer high at arr.length-1 index

 // when mid index is less than or equal to high 
 while(mid<=high)
 {
  // condition  arr[mid]==0 follow then swap arr[low] and arr[mid] and simply incerment mid and low pointer with one 
    if(arr[mid]==0){
        int temp=arr[low];
        arr[low]=arr[mid];
        arr[mid]=temp;
        mid++;
        low++;
    }
  //condition  arr[mid]==1 follow then  simply incerment mid pointer with one 
    else if(arr[mid]==1){
            mid++;
        }
  // else  swap arr[mid] and arr[high] and simply decerment high pointer with one 
    else{
            int temp=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            high--;
        }
}


     System.out.print("after sorting : ");
     for(int x=0;x<n;x++)
      {
        System.out.print(arr[x]+" ");
      }
    
    }
    
}
