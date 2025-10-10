package pattern_printing.triangle;

import java.util.Scanner;

public class reverseNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get reverse same alphabet with rows: ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m + 1 - i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
        System.out.print("Enter a number to get reverse  alphabet with rows: ");
        int n = sc.nextInt();
        for (int k = 1; k <= n; k++) {
            for (int j = 1; j <= n + 1 - k; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
        System.out.print("Enter no. to get reverse  line by line same number with row number : ");
        int o = sc.nextInt();
        for (int s = 1; s <= o; s++) {
            for (int j = 1; j <= o + 1 - s; j++) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        System.out.print("Enter no. to get reverse number with row number : ");
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            for (int j = 1; j <= t + 1 - x; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
