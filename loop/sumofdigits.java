package loop;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number  : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }
        System.out.println("Sum of digits:" + sum);
        sc.close();
    }
}
