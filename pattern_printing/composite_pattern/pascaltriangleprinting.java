package pattern_printing.composite_pattern;

import java.util.Scanner;

public class pascaltriangleprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // triangle shape ke liye spaces print karo
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int val = 1; // har row ka pehla element 1 hota hai
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " "); // value print karo

                // next element nikalne ka formula
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}
