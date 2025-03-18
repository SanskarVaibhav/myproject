import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};

        // Sort the array
        sortArray(arr, arr.length);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Reverse the sorted array
        reverseArray(arr, 0, arr.length - 1);
        System.out.println("Reversed Sorted Array: " + Arrays.toString(arr));
    }

    // Sorts the array using recursive approach (here, using bubble sort)
    public static void sortArray(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap if elements are in the wrong order
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursively sort the remaining elements
        sortArray(arr, n - 1);
    }

    // Reverses the array using recursion
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the remaining elements
        reverseArray(arr, start + 1, end - 1);
    }
}
