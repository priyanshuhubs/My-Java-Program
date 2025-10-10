package Cycle_Sort;

public class missingnumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] b = new boolean[n + 1];
        for (int ele : nums) {
            b[ele] = true;
        }
        for (int i = 0; i <= n; i++) {
            if (b[i] == false)
                return i;
        }
        return 99;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 6, 0 };
        missingnumber ms = new missingnumber();
        int ans = ms.missingNumber(arr);
        System.out.println(ans);
    }
}