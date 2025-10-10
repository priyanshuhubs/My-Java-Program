package TwoDimensionalArray;

import java.util.Scanner;

public class largestele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no. of column: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
         m = arr.length;
         n = arr[0].length;
        System.out.print("Enter Elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int mul = 1;
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mn = Math.min(mn, arr[i][j]);
                mx = Math.max(mx, arr[i][j]);
                sum += arr[i][j];
                mul *= arr[i][j];

            }
        }
        System.out.println("The Minimum Element In Given Array Is: " + mn + " ");
        System.out.println("The Maximum Element In Given Array Is: " + mx + " ");
        System.out.println("The Sum of Element In Given Array Is: " + sum + " ");
        System.out.println("The Product of Element In Given Array Is: " + mul + " ");

        sc.close();
    }
}
