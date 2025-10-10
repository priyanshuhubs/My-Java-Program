package Cycle_Sort;

// worst case
public class cyclesortSwap {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int cyclicSort(int[] arr) {
        int i = 0;
        int swaps = 0;
        int n = arr.length;
        while (i < n) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
                swaps++;
            } 
            else i++;
        }
        return swaps;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1 }; // Worst-case example (5 elements in a single cycle)

        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int totalSwaps = cyclicSort(arr);

        System.out.println("\nSorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nTotal swaps performed: " + totalSwaps);
    }
}
