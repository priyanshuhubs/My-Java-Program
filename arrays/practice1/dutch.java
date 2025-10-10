package arrays.practice1;
public class dutch {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 2, 0, 1, 2, 0, 2, 1 };
        int n = arr.length;

        int noOfZeroes = 0;
        int noOfOnes = 0;

        // Count 0, 1, 2
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                noOfZeroes++;
            }
            if (arr[i] == 1) {
                noOfOnes++;
            }
        }

        // Overwrite array using if-else conditions
        for (int i = 0; i < n; i++) {
            if (i < noOfZeroes) {
                arr[i] = 0;
            } else if (i < noOfZeroes + noOfOnes) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }

        // Print result
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
