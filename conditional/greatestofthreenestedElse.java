// take 3 positive integers input and print the greatest of them.
package conditional;

import java.util.Scanner;

public class greatestofthreenestedElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c)
                System.out.println(a + " is largest");
            else
                System.out.println(c + " is largest");
        } else {
            if (b > c)
                System.out.println(b + " is largest");
            else
                System.out.println(c + " is largest");

        }
        sc.close();
    }
}
