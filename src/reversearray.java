
public class reversearray
{
    public static void reverse(int[] arr)
    {
      int start = 0;
      int end = arr.length-1;
      while (start<end)
      {
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
      }
}
    public static void main(String[] args)
    {
        int[] arr={1,7,8,9};
        reverse(arr);
        System.out.println("after reversing an array");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
