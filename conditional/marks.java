package conditional;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int n = sc.nextInt();
        if (n >= 81)
            System.out.println("Very Good");
        else if (n >= 61 && n <= 80)
            System.out.println("Good");
        else if (n >= 41 && n <= 60)
            System.out.println("Average");
        else
            System.out.println("Fail");
        sc.close();

    }
}
