public class bubblesort {
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

    static void printArray(int [] arr,int size)
    {
        int i;
        for(i=0;i<size;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={5,4,2,3,6,1};
        int n=arr.length;
        System.out.println("original arrya");
        printArray(arr, n);
        Sort(arr, n);
        System.out.println("sorted array : ");
        printArray(arr, n);
    }
}
