package Strings;

import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String str = sc.nextLine();
        System.out.print("Hi ");
        System.out.println(str);
        sc.close();
    }
}
