package TwoDimensionalArray;

import java.util.*;

public class SpiralMatrixsecond {

    // Generate spiral matrix with 1..n^2
    public static int[][] generateSpiralMatrix(int n) {
        int[][] spiral = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int val = 1;

        while (top <= bottom && left <= right) {
            // Top row
            for (int j = left; j <= right; j++)
                spiral[top][j] = val++;
            top++;
            // Right column
            for (int i = top; i <= bottom; i++)
                spiral[i][right] = val++;
            right--;
            // Bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    spiral[bottom][j] = val++;
                bottom--;
            }
            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    spiral[i][left] = val++;
                left++;
            }
        }
        return spiral;
    }

    // Print matrix
    public static void printMatrix(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%4d", mat[i][j]);
            System.out.println(); // row ke baad line break
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] spiral = generateSpiralMatrix(n);

        System.out.println("\nSpiral Matrix (1 to " + (n * n) + "):");
        printMatrix(spiral);

        sc.close();
    }
}
