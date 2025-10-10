package Recursion;

import java.util.Scanner;

/*
 * Problem Statement:
 * You are climbing a staircase with 'n' steps.
 * At a time, you are allowed to take either 1 step or 2 steps.
 * Find the total number of distinct ways to reach the top.
 */

public class StairPath {

    // Recursive function to calculate total ways
    public static int stair(int n) {
        if (n <= 2)
            return n;  // Base cases: 1 step → 1 way, 2 steps → 2 ways
        int ans = stair(n - 1) + stair(n - 2); // Recursive relation
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of steps in the staircase: ");
        int n = sc.nextInt();
        
        System.out.println("You can climb a staircase of '" + n + "' steps in '" 
                           + stair(n) + "' distinct ways (using 1 or 2 steps at a time).");
        
        sc.close();
    }
}
