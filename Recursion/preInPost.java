package Recursion;

import java.util.Scanner;

public class preInPost {
    public static void pip(int n) {
      if(n==0) return;
      System.out.print(n+" ");  //pre
      pip(n-1);
      System.out.print(n+" ");  //In
      pip(n-1);
      System.out.print(n+" ");  //post
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        pip(n);
        sc.close();
    }
}
