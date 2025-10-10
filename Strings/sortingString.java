package Strings;

import java.util.Arrays;

public class sortingString {
    public static void main(String[] args) {
        String s = "raghav";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (char ele : ch) {
            System.out.print(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("Priyanshu");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        for (char ele : arr) {
            System.out.print(ele);
        }

    }
}
