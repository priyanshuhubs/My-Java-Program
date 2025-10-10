//rotate the given array 'a' by k steps,where k is non negative
//without using extra array 
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1); // n-k || k
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter how many time you want to rotate the array : ");
        int k = sc.nextInt();
        System.out.println("Original array: " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.print("Rotate array: " + Arrays.toString(nums));
        sc.close();
    }
}
