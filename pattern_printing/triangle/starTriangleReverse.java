package pattern_printing.triangle;

import java.util.Scanner;


public class starTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*"+" ");
               // System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
