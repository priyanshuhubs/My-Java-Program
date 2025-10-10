package TwoDimensionalArray;

import java.util.Scanner;

public class matrixMultiply {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows for first matrix : ");
        int m = sc.nextInt();
        System.out.print("Enter no. of column for first matrix: ");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter Elements in first matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first given matrix is: ");
        printArray(a);

        System.out.print("Enter no. of rows for second matrix : ");
        int o = sc.nextInt();
        System.out.print("Enter no. of column for second matrix: ");
        int p = sc.nextInt();
        int b[][] = new int[o][p];
        System.out.println("Enter Elements in second matrix : ");
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The second given matrix is: ");

        printArray(b);
        if (a[0].length != b.length) {
            System.out.println("Multiplucation not Possible");
        } else {
            int[][] c = new int[a.length][b[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        // c[i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*[2][j];
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Multiplication of matrices :");
            printArray(c);
        }

        sc.close();
    }
}
