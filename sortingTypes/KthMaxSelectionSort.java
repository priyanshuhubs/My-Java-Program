package sortingTypes;

// Selection Sort ka variant -> har pass me kth maximum element ko right jagah pe rakhta hai
public class KthMaxSelectionSort {

    // Sorting method (increasing order using kth max placement)
    public void sort(int[] arr) {
        int n = arr.length;

        // Outer loop -> n-1 passes chalte hain
        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE; // sabse chhota value se start karte hain
            int maxdx = -1; // max element ka index store karne ke liye

            // Inner loop -> unsorted part me maximum element dhundho
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > max) {
                    max = arr[j]; // max value update karo
                    maxdx = j; // index bhi update karo
                }
            }

            // Ab jo max mila usko unsorted ke rightmost position me swap karo
            swap(arr, n - 1 - i, maxdx);
        }
    }

    // Swap function -> do elements ki jagah exchange karta hai
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print array elements
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // Main function -> execution yahin se start hota hai
    public static void main(String[] args) {
        int[] arr = { 2, 4, 31, -3, -1, 33 };

        KthMaxSelectionSort st = new KthMaxSelectionSort();
        st.sort(arr);

        System.out.print("Sorted Array (Increasing Order): ");
        printArray(arr); // ab yaha sirf function call hoga
    }
}
