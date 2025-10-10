package conditional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x coordinate: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter y coordinate: ");
        int y = scanner.nextInt();
        
        if (x == 0 && y == 0) {
            System.out.println("The point lies at the origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the x-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("The point lies in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in the fourth quadrant.");
        }
        scanner.close();
    }
}
