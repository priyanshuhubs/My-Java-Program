package Recursion;

import java.util.*;

public class KLengthIncreasingSequences {
    static ArrayList<String> arr = new ArrayList<>();

    public static void generate(int start, int n, int k, String ans) {
        // base case
        if (k == 0) {
            arr.add(ans); // store sequence
            return;
        }

        // recursive case
        for (int i = start; i <= n; i++) {
            generate(i + 1, n, k - 1, ans + i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 6, k = 4;
        arr = new ArrayList<>();

        generate(1, n, k, "");

        // Print all sequences (clean)
        for (String seq : arr) {
            System.out.println(seq);
        }
    }
}
