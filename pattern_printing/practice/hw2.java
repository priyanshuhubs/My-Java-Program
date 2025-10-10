package pattern_printing.practice;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for rows & columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) {
                // First and last row: print all stars
                for (int j = 1; j <= cols; j++) {
                    System.out.print("*");
                }
            } else {
                // Middle rows: print 2 stars then spaces
                for (int j = 1; j <= cols; j++) {
                    if (j <= 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}