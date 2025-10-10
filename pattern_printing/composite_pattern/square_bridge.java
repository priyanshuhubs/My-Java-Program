package pattern_printing.composite_pattern;

import java.util.Scanner;

public class square_bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("*" + " ");
            }
           
                System.out.print(" " + " ");
            

            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            sc.close();
        }
    }
  
}
