package pattern_printing.practice;

public class alphabridgegap {
    public static void main(String[] args) {
        int n = 4;

        // First row: A...G
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print((char)(i + 64) + " ");
        }
        System.out.println();

        // Next rows
        for (int i = 1; i <= n-1; i++) {
            // Left side
            for (int j = 1; j <= n - i; j++) {
                System.out.print((char)(j + 64) + " ");
            }

            // Middle gap
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }

            // Right side (E F G / F G / G)
            for (int j = n + i; j <= 2 * n - 1; j++) {
                System.out.print((char)(j + 64) + " ");
            }

            System.out.println();
        }
    }
}
