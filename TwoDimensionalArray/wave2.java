package TwoDimensionalArray;

import java.util.Scanner;

public class wave2 {
    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

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
        print(arr);
        // rotate -> reverse each row
        for (int i = 0; i < m; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        sc.close();
    }
}
