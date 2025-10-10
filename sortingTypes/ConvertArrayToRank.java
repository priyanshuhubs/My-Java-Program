// Language: Java
// Program to convert a given array into ranks (0 to N-1 form)

package sortingTypes;

public class ConvertArrayToRank {

    // Function to print array elements
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Given Array
        int[] arr = { 40, 12, 78, 34, 100, 57, 23 };
        // Expected Final Converted Array: 3 0 5 2 6 4 1

        int n = arr.length;

        System.out.print("Given Array: ");
        print(arr); // Print original array

        int x = 0; // Rank counter starting from 0

        // Outer loop to assign ranks
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE; // Initialize minimum value
            int mindx = -1; // Index of minimum element

            // Find the minimum element which is still positive
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // Replace the minimum element with rank (negative value)
            arr[mindx] = x;
            x--; // Decrease rank counter
        }

        // Convert all negative values into positive ranks
        for (int i = 0; i < n; i++) {
            arr[i] *= (-1);
        }

        System.out.print("Final Converted Array: ");
        print(arr); // Print final ranked array
    }
}
