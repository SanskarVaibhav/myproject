
public class minelementinrotatedarray {

    // This is a simple Java program to find the minimum element in a rotated sorted array.
    // The program first sorts the array using bubble sort and then finds the minimum element.
    // The time complexity of the bubble sort is O(n^2) and the time complexity of finding the minimum element is O(n).
    // The overall time complexity is O(n^2).
    // The space complexity is O(1) as we are using only a constant amount of extra space.
     
    static void Sort(int [] arr,int n)
    {
        int i,j,temp;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                } 
            }
        }
    }

    void findMin(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the rotated array is: " + min);
    }

  

    

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int n = arr.length;

        Sort(arr, n);
    
        minelementinrotatedarray obj = new minelementinrotatedarray();
        obj.findMin(arr, n);
    }

}
