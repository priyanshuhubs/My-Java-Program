package conditional;
import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the age of Ram: ");
        int ageRam = input.nextInt();

        System.out.print("Enter the age of Shyam: ");
        int ageShyam = input.nextInt();

        System.out.print("Enter the age of Ajay: ");
        int ageAjay = input.nextInt();

        if (ageRam < ageShyam && ageRam < ageAjay) {
            System.out.println("Ram is the youngest.");
        } else if (ageShyam < ageRam && ageShyam < ageAjay) {
            System.out.println("Shyam is the youngest.");
        } else {
            System.out.println("Ajay is the youngest.");
        }

        input.close();
    }
}
