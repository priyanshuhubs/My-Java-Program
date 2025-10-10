package bigining;

import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = (double) x;
        System.out.println(y / 2);
        double z = sc.nextDouble();
        int k = (int) z;
        System.out.println(k);
        sc.close();

    }
}
