package bigining;
import java.util.Scanner;

public class areaofcirclrinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        double a = 3.141592*r*r;
        System.out.println(a);
        sc.close();
    }
}
