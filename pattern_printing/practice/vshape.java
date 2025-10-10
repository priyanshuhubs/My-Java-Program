package pattern_printing.practice;

import java.util.Scanner;

public class vshape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // left spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // inner spaces between two stars
            if (i != n - 1) {
                for (int j = 0; j < 2 * (n - i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                // second star
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}
