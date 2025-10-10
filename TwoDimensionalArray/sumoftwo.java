package TwoDimensionalArray;

import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows for matrix: ");
        int m = sc.nextInt();
        System.out.print("Enter no. of column for matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.print("Enter elements for first matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for second matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] += sc.nextInt();
            }
        }
    System.out.println("Sum of both matrices: ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
           System.out.print(arr[i][j]+" "); 
        }
        System.out.println();
    }
    sc.close();
    }
}
