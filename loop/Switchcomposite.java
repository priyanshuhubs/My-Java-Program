package loop;

import java.util.Scanner;

public class Switchcomposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int x = 0; // 0 means prime
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                System.out.println("composite number");
                x = 1; // 1 means composite
                break;
            }
        }
        if (n == 1)
            System.out.println("neither prime nor composite");
        else if (x == 0)
            System.out.println("Prime number");
            sc.close();
    }
    
}
