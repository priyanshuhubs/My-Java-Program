package sortingTypes;

public class swapZerowithBubbleSort {

    // Method to push all zeros towards the end of the array
    // Using bubble sort style swapping
    public void mainZero(int[] arr) {
        int noz = 0; // Variable to count total number of zeros
        int n = arr.length; // Length of the array

        // Step 1: Count the number of zeros
        for (int ele : arr) {
            if (ele == 0)
                noz++;
        }

        // Step 2: Repeat process "noz" times to push each zero to the end
        for (int x = 0; x < noz; x++) {
            // Traverse the array till n-1-x (like bubble sort shrinking boundary)
            for (int i = 0; i < n - 1 - x; i++) {
                // If current element is zero, swap with next element
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Main method: program execution starts here
    public static void main(String[] args) {
        // Input array with some zeros in between
        int[] arr = { 0, 2, 2, 11, 3, 3, 221, 11, 0, 0, 6, 0, 4, 0 };

        // Create object of class (because mainZero is non-static)
        swapZerowithBubbleSort sz = new swapZerowithBubbleSort();

        // Call the method to modify the array
        sz.mainZero(arr);

        // Print final array after moving zeros to the end
        System.out.print("Array after pushing zeros to the end: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
