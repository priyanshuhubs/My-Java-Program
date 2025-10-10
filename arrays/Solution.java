package arrays;

import java.util.Scanner;

public class Solution {
    public int[] twosum(int[] arr, int x) {
        int[] ans = new int[2];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    ans[0] = i;
                    ans[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        int[] result = obj.twosum(arr, target);
        System.out.println("Index: [" + result[0] + "," + result[1] + "]");
        System.out.println("Value: " + arr[result[0]] + "+" + arr[result[1]] + "=" + target);
        sc.close();
    }
}
