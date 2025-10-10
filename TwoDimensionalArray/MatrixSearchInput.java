package TwoDimensionalArray;
import java.util.*;

class MatrixSearchInput {
    // Function to search target in staircase matrix (top-right approach)
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i = 0, j = n - 1;  // Start from top-right corner

        while(i < m && j >= 0) {  // Loop until inside matrix boundaries
            if(arr[i][j] == target) return true;  // Target found
            else if(arr[i][j] > target) j--;      // Move left if current > target
            else i++;                             // Move down if current < target
        }
        return false; // Target not found
    }

    // Function to create staircase matrix (row & column sorted) from random input
    public int[][] createSortedMatrix(int[][] randomMatrix) {
        int m = randomMatrix.length;
        int n = randomMatrix[0].length;

        // Step 1: Flatten matrix into 1D array
        int[] elements = new int[m * n];
        int idx = 0;
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                elements[idx++] = randomMatrix[i][j];

        // Step 2: Sort all elements
        Arrays.sort(elements);

        // Step 3: Fill matrix row by row to get staircase pattern
        int[][] matrix = new int[m][n];
        idx = 0;
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = elements[idx++];

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixSearchInput obj = new MatrixSearchInput();

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        // Input random matrix
        int[][] randomMatrix = new int[m][n];
        System.out.println("Enter " + (m*n) + " elements in any order:");
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                randomMatrix[i][j] = sc.nextInt();

        // Create staircase sorted matrix
        int[][] sortedMatrix = obj.createSortedMatrix(randomMatrix);

        // Print staircase matrix
        System.out.println("\nStaircase Sorted Matrix (row & column sorted):");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(sortedMatrix[i][j] + " ");
            System.out.println();
        }

        // Input target value
        System.out.print("\nEnter target value: ");
        int target = sc.nextInt();

        // Search target
        boolean found = obj.searchMatrix(sortedMatrix, target);
        System.out.println("Target " + target + " found " + found);

        sc.close();
    }
}
