// Java Program to implement Insertion Sort
package sortingTypes;

public class insertionSorting {
    // Function to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; // store arr[i] in temp
        arr[i] = arr[j]; // assign arr[j] to arr[i]
        arr[j] = temp; // put temp (old arr[i]) into arr[j]
    }

    // Function to print the array
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " "); // print each element
        }
        System.out.println(); // move to next line after printing
    }

    // Main function
    public static void main(String[] args) {
        // Input array (unsorted)
        int[] arr = { 10, -4, 20, 1, -6, 8 };
        int n = arr.length;

        // Insertion Sort logic
        // for (int i = 1; i < n; i++) { // start from index 1
        // for (int j = i; j >= 1 && arr[j] < arr[j - 1]; j--) {
        // swap(arr, j, j - 1);
        // }
        // }

        
        // Insertion Sort logic
        for (int i = 1; i < n; i++) { // start from index 1
            int j = i;
            while (j >= 1 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
        System.out.println("Final Sorted Array: ");
        print(arr);
    }
}
