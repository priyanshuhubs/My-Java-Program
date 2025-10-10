package pattern_printing.practice;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // Left side numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }

            // Right side numbers
            for (int j = n - i + 1; j >= 1; j--) {
                if (j != n) {  // to avoid duplicate in first row
                    System.out.print(j + " ");
                }
            }


            System.out.println();
        }

        sc.close();
    }
}
