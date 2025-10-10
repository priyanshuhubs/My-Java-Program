package pattern_printing.special_pattern;

import java.util.Scanner;

public class binary_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1 && j % 2 == 1 || i % 2 == 0 && j % 2 == 0) {
                    System.out.print(1 + " ");
                } else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Enter another number: ");

        int y = sc.nextInt();
        for (int k = 1; k <= y; k++) {
            for (int l = 1; l <= k; l++) {
                if ((k + l) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
