package Recursion;

import java.util.Scanner;

public class StairCaseTwo {
        // Recursive function to calculate total ways
    public static int stair(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        int ans = stair(n - 1) + stair(n - 3); // Recursive relation
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of steps in the staircase: ");
        int n = sc.nextInt();
        
        System.out.println("You can climb a staircase of '" + n + "' steps in '" 
                           + stair(n) + "' distinct ways (using 1 or 3 steps at a time).");
        
        sc.close();
    }
}
