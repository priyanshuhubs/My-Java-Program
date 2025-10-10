package Strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        StringBuilder s = new StringBuilder(sc.nextLine());

        // Create another StringBuilder to store reversed string
        StringBuilder reversed = new StringBuilder();

        // Traverse from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i)); // pick last char and append
        }

        // Print result
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
