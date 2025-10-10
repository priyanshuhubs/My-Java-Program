package arrays.practice1;
public class prv {
    public static void main(String[] args) {
        int[] arr = { 12, 8, 60, 37, 2, 49, 16, 28, 21 };
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = -1;
        int nge = arr[2];
        for (int i = 0; i<n; i++) {
            ans[i] = nge;
            nge = Math.max(arr[i], nge);

        }
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
