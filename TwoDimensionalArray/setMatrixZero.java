package TwoDimensionalArray;

public class setMatrixZero {
    public static void main(String[] args) {
        setMatrixZero sol = new setMatrixZero();
        // Input matrix
        int[][] arr = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };
        System.out.println("Before setting Zeroes: ");
        printMatrix(arr); // print original matrix

        sol.setZeroes(arr); // call function to modify matrix

        System.out.println("After setting zeroes: ");
        printMatrix(arr); // print modified matrix
    }

    // Helper method to print a 2D matrix
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // loop over rows
            for (int j = 0; j < arr[0].length; j++) { // loop over columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }

    // Core function: set row & column to zero if any element is zero
    public void setZeroes(int[][] arr) {
        int m = arr.length; // number of rows
        int n = arr[0].length; // number of columns

        // Flags to remember whether first row/col should be zeroed later
        boolean zeroRow = false;
        boolean zeroCol = false;

        // Step 1: Check if first row contains a zero
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                zeroRow = true; // mark that full row 0 must be zeroed at the end
                break;
            }
        }

        // Step 2: Check if first column contains a zero
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zeroCol = true; // mark that full column 0 must be zeroed at the end
                break;
            }
        }

        // Step 3: Use first row & first column as "markers"
        // If arr[i][j] == 0 then mark arr[i][0] and arr[0][j] as 0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0; // mark column j
                    arr[i][0] = 0; // mark row i
                }
            }
        }

        // Step 4: Zero out columns based on first row markers
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) { // if marker found
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0; // make entire column j = 0
                }
            }
        }

        // Step 5: Zero out rows based on first column markers
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) { // if marker found
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0; // make entire row i = 0
                }
            }
        }

        // Step 6: Finally handle the first row (if it had any zero initially)
        if (zeroRow == true) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Step 7: Finally handle the first column (if it had any zero initially)
        if (zeroCol == true) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
