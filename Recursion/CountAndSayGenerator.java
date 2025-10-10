package Recursion;

import java.util.Scanner;

public class CountAndSayGenerator {

    // Function to generate the nth term of Count and Say sequence
    public String countAndSay(int n) {
        if (n == 1) return "1"; // base case

        String s = countAndSay(n - 1) + "@"; // recursion
        String ans = "";
        int i = 0, j = 0;

        // process string to form the count-and-say sequence
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int len = j - i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }

    // Main function to run and test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountAndSayGenerator obj = new CountAndSayGenerator();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        String result = obj.countAndSay(n);
        System.out.println("The " + n + "th term of the Count and Say sequence is: " + result);

        sc.close();
    }
}
