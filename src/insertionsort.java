public class insertionsort 
{
  void sort(int[] arr)
  {
    int n=arr.length;
    for(int i=1;i<n;++i)
    {
        int key=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>key) 
        {
             arr[j+1]=arr[j];
             j=j-1;
        }
        arr[j+1]=key;
    }
  } 
   
  static void printArray(int[] arr)
  {
    for(int j : arr)
    System.out.print(j+" ");
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr={5,4,2,3,6,1};
    System.out.println("original array");
    printArray(arr);
    System.out.println("sorted array");
    insertionsort ob=new insertionsort();
    ob.sort(arr);
    printArray(arr);
  }

}
