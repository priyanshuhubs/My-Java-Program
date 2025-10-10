package TwoDimensionalArray;

import java.util.Scanner;

public class basicDecl {
    public static void main(final String[] args) {
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
        System.out.println("Given Array : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }

}
