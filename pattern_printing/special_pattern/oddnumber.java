package pattern_printing.special_pattern;

import java.util.Scanner;

public class oddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2 * j - 1 + " ");
            }
            System.out.println();
        }
        System.out.print("Enter no.: ");
        int m = sc.nextInt();
        for (int p = 1; p <= m; p++) {
            for (int j = 1; j <= 2 * p - 1; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.print("Enter no.: ");
        int o = sc.nextInt();
        for (int k = 1; k <= o; k++) {
            int a = 1;
            for (int j = 1; j <= k; j++) {
                System.out.print(a + " ");
                a+=2;
            }
            System.out.println();
        }
        sc.close();
    }

}
