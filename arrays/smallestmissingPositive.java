package arrays;

import java.util.Scanner;

public class smallestmissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The smallest missing positive number is: " + findSmallestMissingPositive(arr));
        sc.close();
    }

    public static int findSmallestMissingPositive(int[] arr) {
        int expected = 1;
        for (int num : arr) {
            if (num == expected) {
                expected++;
            }
        }
        return expected;
    }
}
