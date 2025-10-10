package Recursion;

import java.util.Scanner;

public class printOneToN {

    public static void print(int x, int n) {
        if (x > n) return; // base case
        System.out.println(x); // work
        print(x + 1, n); // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        print(1, n);
        sc.close();
    }
}
