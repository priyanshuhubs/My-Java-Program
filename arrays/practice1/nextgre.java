package arrays.practice1;
public class nextgre {
    public static void main(String[] args) {
        int[] arr = { 12, 8, 60, 37, 2, 49, 16, 28, 21 };
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;

        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, arr[j]);
            }
            ans[i] = max;
        }
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
