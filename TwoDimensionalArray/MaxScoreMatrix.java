package TwoDimensionalArray;

public class MaxScoreMatrix {
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            int noOfZeroes = 0;
            int noOfOnes = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0)
                    noOfZeroes++;
                else
                    noOfOnes++;
            }
            if (noOfZeroes > noOfOnes) {
                for (int i = 0; i < m; i++) {
                    if (arr[i][j] == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
        }
        int score = 0;
        int x = 1;
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j] * x);
            }
            x *= 2;
        }
        return score;
    }

    public static void main(String[] args) {
        MaxScoreMatrix sm = new MaxScoreMatrix();
        int[][] arr = { { 0, 0, 1, 1 },
                        { 1, 0, 0, 1 },
                        { 1, 1, 0, 0 } };
        int result = sm.matrixScore(arr);

        System.out.println("Maximum Score: " + result);
        System.out.println("Matrix after flipping:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
