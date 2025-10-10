package Recursion;

import java.util.Scanner;

public class HCF {
  
public static int gcd(int a,int b){
    if(b%a==0) return a;
    return gcd(b%a,a);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no: ");
        int a = sc.nextInt();
        System.out.print("Enter second no: ");
        int b = sc.nextInt();
        System.out.print(gcd(a, b));
        sc.close(); 
    }
}
