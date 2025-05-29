public class pivotelement {
    static int search(int[] arr, int key) {
      // approach using single binary search
        int start = 0; 
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key)
                return arr[mid];


            if (arr[mid] >= arr[start]) {
                if (key >= arr[start] && key < arr[mid])
                    end = mid - 1;
                
                else
                    start = mid + 1;
            }
          
            else {
              
                if (key > arr[mid] && key <= arr[end])
                    start = mid + 1;
              
                else
                    end = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr1 = {9,10,2,4,6,8};
        int key1 = 10;
        System.out.println(search(arr1, key1));
    }
}
