package Recursion;

import java.util.Scanner;

public class fibonaciNumber {
    public static int fibo(int n) {
        if (n <= 1)
            return n; // base case
        int ans = fibo(n - 1) + fibo(n - 2); // call
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
        sc.close();
    }
}
