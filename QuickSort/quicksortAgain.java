package QuickSort;

public class quicksortAgain {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int lo, int hi) {
        int smallercount = 0;
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= arr[lo])
                smallercount++;
        }
        int correctIdx = smallercount + lo;
        swap(arr, lo, correctIdx);

        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= arr[correctIdx])
                i++;
            else if (arr[j] >= arr[correctIdx])
                j--;
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIdx;
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi)
            return;
        int idx = partition(arr, lo, hi);
        quickSort(arr, lo, idx - 1);
        quickSort(arr, idx + 1, hi);

    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 7, 1, 2, 3, 6, 5, 8 };
        int n = arr.length;
        print(arr);
        quickSort(arr, 0, n - 1);
        print(arr);
    }
}
