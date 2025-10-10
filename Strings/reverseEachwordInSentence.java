package Strings;

import java.util.Scanner;

public class reverseEachwordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i = 0, j = 0;
        int n = sb.length();
        while (j < n) {
            if (sb.charAt(j) != ' ')
                j++;
            else {
                if (i <= j - 1)
                    reverse(sb, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        if (i <= j - 1)
            reverse(sb, i, j - 1); // for last word reverse
        System.out.println(sb);
        sc.close();
    }

    public static void reverse(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;

        }
    }

}
