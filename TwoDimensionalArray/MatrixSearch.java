package TwoDimensionalArray;

class MatrixSearch {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i = m - 1, j = 0;
        while (i >= 0 && j < n) {
            if (arr[i][j] == target)
                return true;
            else if (arr[i][j] > target)
                i--;
            else
                j++;
        }
        return false;
    }

    // main method for testing
    public static void main(String[] args) {
        MatrixSearch sol = new MatrixSearch();

        int[][] matrix = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 },
                { 10, 13, 14, 17 }
        };

        int target1 = 5;
        int target2 = 15;

        System.out.println("Searching " + target1 + ": " + sol.searchMatrix(matrix, target1)); // true
        System.out.println("Searching " + target2 + ": " + sol.searchMatrix(matrix, target2)); // false
    }
}
