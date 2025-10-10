package conditional;
import java.util.Scanner;
public class greatestofthree {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter 1st no. : ");
      int a = sc.nextInt();
    System.out.println("Enter 2nd number : ");
    int b = sc.nextInt();
    System.out.println("Enter 3rd number : ");
    int c = sc.nextInt();
    if(a>=b && a>=c) System.out.println(a+" is greatest");
    if(b>=a && b>=c) System.out.println(b+" is greatest");
    if(c>=a && c>=b) System.out.println(c+" is greatest");
    sc.close();

    }
}
