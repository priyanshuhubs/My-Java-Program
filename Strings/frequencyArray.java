package Strings;

import java.util.Scanner;

public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();   // String input lena

        // Frequency array banaya (a-z ke liye 26 boxes)
        int[] freq = new int[26];

        // Har character ki frequency count karna
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);        // String ke i-th character ko lena
            int idx = (int) ch - 97;      // 'a' -> 0, 'b' -> 1, ... 'z' -> 25
            freq[idx]++;                  // us character ka count badhao
        }

        // Max frequency find karna
        int maxFreq = -1;
        for (int i = 0; i < freq.length; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }

        // Output start
        System.out.print("Character(s) with maximum frequency: ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                char ch = (char) (i + 97);   // Index se character banana
                System.out.print(ch + " ");
            }
        }

        sc.close();
    }
}
