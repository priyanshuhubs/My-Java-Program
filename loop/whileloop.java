package loop;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        // int i = 1;
        // for(;i<=n;){
        // System.out.println(i);
        // i++;
        // }
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
