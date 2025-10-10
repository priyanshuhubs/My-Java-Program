package Cycle_Sort;

public class MissingNoFinderWithSum {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int idxSum = n * (n + 1) / 2;
        int missing = idxSum - sum;
        return missing;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 6, 0 };
        MissingNoFinderWithSum ms = new MissingNoFinderWithSum();
        int ans = ms.missingNumber(arr);
        System.out.println("Missing number is: " + ans);
    }
}
