package Recursion;

import java.util.Scanner;

public class printInceresingAfterCall {
      public static void print(int n) {
        if (n == 0)  return; //base case
        print(n - 1); // call
        System.out.println(n); // work
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
