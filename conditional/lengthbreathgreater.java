package conditional;

import java.util.Scanner;

public class lengthbreathgreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth of the rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area and perimeter
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        // Check if area is greater than perimeter
        if (area > perimeter) {
            System.out.println("Area is greater than perimeter.");
        } else {
            System.out.println("Perimeter is greater than or equal to area.");
        }

        scanner.close();
    }
}