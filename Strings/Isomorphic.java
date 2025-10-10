package Strings;

import java.util.Scanner;

public class Isomorphic {

    // Function to check if two strings are isomorphic
    public boolean isOmorphic(String s, String t) {
        if (s.length() != t.length()) return false; // Agar length alag hai, to isomorphic nahi ho sakte

        char[] a = new char[128]; // ASCII mapping ke liye array

        // Step 1: Map s -> t
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // s ka character
            char dh = t.charAt(i);  // t ka character
            int idx = (int) ch;

            if (a[idx] == '\0') 
                a[idx] = dh; // Agar mapping empty hai, assign kar do
            else if (a[idx] != dh) 
                return false; // Agar mapping alag nikli to isomorphic nahi hai
        }

        // Array ko reset karna (nayi mapping ke liye)
        for (int i = 0; i < 128; i++) {
            a[i] = '\0';
        }

        // Step 2: Map t -> s
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);  // t ka character
            char dh = s.charAt(i);  // s ka character
            int idx = (int) ch;

            if (a[idx] == '\0') 
                a[idx] = dh; // Agar mapping empty hai, assign kar do
            else if (a[idx] != dh) 
                return false; // Agar mapping alag nikli to isomorphic nahi hai
        }
        return true; // Agar dono mapping sahi hai to isomorphic hai
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se input lena
        System.out.print("Enter the first word: ");
        String s = sc.next();

        System.out.print("Enter the second word: ");
        String t = sc.next();

        // Object create karna
        Isomorphic sm = new Isomorphic();

        // Function call karke result lena
        boolean result = sm.isOmorphic(s, t);

        // Result print karna
        if (result) {
            System.out.println("The words \"" + s + "\" and \"" + t + "\" are ISOMORPHIC.");
        } else {
            System.out.println("The words \"" + s + "\" and \"" + t + "\" are NOT ISOMORPHIC.");
        }

        sc.close();
    }
}
