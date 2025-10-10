package Recursion;

import java.util.Scanner;

public class maze2 {

    // Recursive function to calculate total ways
    public static int maze(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        int rightWays = maze( m, n-1);
        int downWays = maze( m-1, n);
        return rightWays + downWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(maze( m, n));
        sc.close();
    }
}
