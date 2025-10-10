package Recursion;

import java.util.Scanner;

public class powerFunctionOptimized {
    public static int power(int a, int b) {
        if (b == 0)
            return 1;
        int ans = power(a, b / 2);
        if (b % 2 == 0)
            return ans * ans;
        else
            return ans * ans * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power " + b + " is " + power(a, b));
        sc.close();
    }
}
