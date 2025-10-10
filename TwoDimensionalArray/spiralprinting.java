package TwoDimensionalArray;

import java.util.Scanner;

public class spiralprinting {
    // Function to print the original array
    public static void printArray(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        System.out.println("\nOriginal Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to print array in spiral order
    public static void printSpiral(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int minrow = 0, mincol = 0;
        int maxrow = m - 1, maxcol = n - 1;

        System.out.println("\nSpiral Order Printing:");
        while (minrow <= maxrow && mincol <= maxcol) {

            // 1. Top row
            for (int j = mincol; j <= maxcol; j++) {
                System.out.print(arr[minrow][j] + " ");
            }
            minrow++;

            // 2. Right column
            for (int i = minrow; i <= maxrow; i++) {
                System.out.print(arr[i][maxcol] + " ");
            }
            maxcol--;

            // 3. Bottom row
            if (minrow <= maxrow) {
                for (int j = maxcol; j >= mincol; j--) {
                    System.out.print(arr[maxrow][j] + " ");
                }
                maxrow--;
            }

            // 4. Left column
            if (mincol <= maxcol) {
                for (int i = maxrow; i >= minrow; i--) {
                    System.out.print(arr[i][mincol] + " ");
                }
                mincol++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // First print the original array
        printArray(arr);

        // Then print in spiral order
        printSpiral(arr);

        sc.close();
    }
}
