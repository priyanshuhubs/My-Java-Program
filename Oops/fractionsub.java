package Oops;

public class fractionsub {
    // Euclidean Algorithm for gcd
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Subtraction method (returns a new Fraction)
    public static Fraction subtract(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.den - f2.num * f1.den; // cross multiply
        int denominator = f1.den * f2.den; // common denominator
        return new Fraction(numerator, denominator); // constructor auto-simplifies
    }

    public static class Fraction {
        int num;
        int den;

        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }

        public void simplify() {
            int hcf = gcd(Math.abs(num), Math.abs(den)); // find gcd
            num /= hcf;
            den /= hcf;

            if (den < 0) { // keep denominator positive
                num = -num;
                den = -den;
            }
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(7, 3); // 7/3
        Fraction f2 = new Fraction(3, 22); // 3/22

        // reassign result back to f1
        f1 = subtract(f1, f2);

        System.out.println("Updated First Fraction after subtraction: " + f1.num + "/" + f1.den);
    }
}
