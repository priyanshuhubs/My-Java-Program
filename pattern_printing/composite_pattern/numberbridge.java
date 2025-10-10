package pattern_printing.composite_pattern;

import java.util.Scanner;

public class numberbridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // first row ka last number (1..last)

        // Row-0: 1 2 3 ... (2n-1)
        for (int x = 1; x <= 2 * n - 1; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Row-1 se Row-(n-1) tak
        for (int i = 1; i <= n - 1; i++) {
            // LEFT block: 1 .. (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }

            // MIDDLE gap: beech ke (2*i - 1) numbers "remove" -> utni jagah
            for (int s = 1; s <= 2 * i - 1; s++) {
                System.out.print("  "); // do spaces = ek number + trailing space ki jagah
            }

            // RIGHT block: (n + i) .. (2n - 1)
            for (int j = n + i; j <= 2 * n - 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
