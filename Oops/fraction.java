package Oops;

import java.util.Scanner;

public class fraction {
    //  Euclidean Algorithm for gcd (works for both a > b and a < b)
    
    public static int gcd(int a, int b) {
        if (b == 0)
            return a; // base case: when remainder is 0, 'a' is gcd
        return gcd(b, a % b); // recursive step: gcd(b, remainder)
    }

    // Add two fractions
    public static Fraction add(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.den + f2.num * f1.den; // cross multiply numerators
        int denominator = f1.den * f2.den; // common denominator
        return new Fraction(numerator, denominator); // constructor auto-simplifies
    }

    // Multiply two fractions
    public static Fraction multiply(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.num; // cross multiply numerators
        int denominator = f1.den * f2.den; // common denominator
        return new Fraction(numerator, denominator); // constructor auto-simplifies
    }

    public static class Fraction {
        int num;
        int den;

        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify(); // always store fraction in simplest form
        }

        public void simplify() {
            int hcf = gcd(Math.abs(num), Math.abs(den)); // HCF must be positive
            num /= hcf; // divide numerator by HCF
            den /= hcf; // divide denominator by HCF

            if (den < 0) { // keep denominator positive
                num = -num;
                den = -den;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking first fraction
        System.out.print("Enter numerator of first fraction: ");
        int n1 = sc.nextInt();
        System.out.print("Enter denominator of first fraction: ");
        int d1 = sc.nextInt();
        Fraction f1 = new Fraction(n1, d1);
        System.out.println("First Fraction (simplified): " + f1.num + "/" + f1.den);

        // Taking second fraction
        System.out.print("Enter numerator of second fraction: ");
        int n2 = sc.nextInt();
        System.out.print("Enter denominator of second fraction: ");
        int d2 = sc.nextInt();
        Fraction f2 = new Fraction(n2, d2);
        System.out.println("Second Fraction (simplified): " + f2.num + "/" + f2.den);

        // Adding
        Fraction f3 = add(f1, f2);
        System.out.println("Sum of Fractions: " + f3.num + "/" + f3.den);

        // Multiply
         Fraction f4 = multiply(f1, f2);
        System.out.println("Multiplicatin of Fractions: " + f4.num + "/" + f4.den);
        sc.close();
    }
}
