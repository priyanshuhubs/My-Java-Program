package pattern_printing.special_pattern;

import java.util.Scanner;

public class flyod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
           
        }
        sc.close();
    }
}
