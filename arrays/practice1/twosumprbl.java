package arrays.practice1;

import java.util.Scanner;

public class twosumprbl {
    public static void twosum(int[] nums, int x) {
        int n = nums.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == x) {
                    System.out.println("Value: " + nums[i] + " " + nums[j]);
                    System.out.println("Index: " + i + " " + j);
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                break;
        }
        if (!flag) {
            System.out.println("No pair found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        twosum(arr, target);
        sc.close();
    }
}
