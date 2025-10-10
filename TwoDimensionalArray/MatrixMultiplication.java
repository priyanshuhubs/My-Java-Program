package TwoDimensionalArray;

import java.util.Scanner;

public class MatrixMultiplication {

    // Function to print a matrix
    public static void printArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first matrix
        System.out.print("Enter number of rows for First Matrix (A): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns for First Matrix (A): ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        System.out.println("Enter elements of First Matrix (A): ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nFirst Matrix (A):");
        printArray(A);

        // Input second matrix
        System.out.print("\nEnter number of rows for Second Matrix (B): ");
        int o = sc.nextInt();
        System.out.print("Enter number of columns for Second Matrix (B): ");
        int p = sc.nextInt();

        int[][] B = new int[o][p];
        System.out.println("Enter elements of Second Matrix (B): ");
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nSecond Matrix (B):");
        printArray(B);

        // Check multiplication condition
        if (n != o) {
            System.out.println("\nMatrix Multiplication NOT possible.");
            System.out.println("Reason: Columns of First Matrix (A) = " + n +
                               " and Rows of Second Matrix (B) = " + o +
                               " → They are not equal.");
        } else {
            // Perform multiplication
            int[][] C = new int[m][p]; // Resultant matrix dimensions = m × p

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    for (int k = 0; k < n; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Output result
            System.out.println("\nResultant Matrix (C = A * B):");
            printArray(C);

            System.out.println("\nMatrix A dimensions: " + m + " * " + n);
            System.out.println("Matrix B dimensions: " + o + " * " + p);
            System.out.println("Resultant Matrix dimensions: " + m + " * " + p);
        }

        sc.close();
    }
}
