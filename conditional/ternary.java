package conditional;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n%2==0) ? "Even" : "Odd");
        sc.close();
    }
}
