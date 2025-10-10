package pattern_printing.practice;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n = 4;
              int totalCols = 2 * n - 1;  // total letter positions (A..G)

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= totalCols; j++) {
                // print letter when j is in left block or in right block
                if (j <= n - i || j >= n + i) {
                    System.out.print((char)(j + 64) + " ");
                } else {
                    // for middle positions print same width as "letter + space"
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
