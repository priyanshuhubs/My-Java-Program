package conditional;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();

        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();

        if (sp > cp)
            System.out.println("There is a Profit of " + (sp - cp));
        if (cp > sp)
            System.out.println("There is a Loss of " + (cp - sp));
        if (cp == sp)
            System.out.println("no profit no loss");
            sc.close();
        
    }

}