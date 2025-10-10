package Recursion;

import java.util.Scanner;

public class printNToOne {
    public static void print(int n) {
        System.out.println(n);
        if (n == 0)
            return;
        print(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
