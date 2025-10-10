package arrays;

import java.util.Scanner;

public class outputOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

