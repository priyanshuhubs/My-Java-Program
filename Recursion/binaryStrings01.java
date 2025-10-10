//  print all binary string posiblity of length n

package Recursion;

import java.util.Scanner;

public class binaryStrings01 {
    public static void printString(String s, int n) {
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
            printString(s+0, n);
            printString(s+1, n);
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printString("", n);
        sc.close();
    }
}
