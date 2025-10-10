package bigining;

import java.util.Scanner;

public class sumoftwonumberinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println(a + b);
        sc.close();
    }
}
