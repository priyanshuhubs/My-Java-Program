package TwoDimensionalArray; // package same

import java.util.*; // List, ArrayList ke liye import

public class SpiralMatrix { // Class name changed

    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> ans = new ArrayList<>();

        int minrow = 0, mincol = 0;
        int maxrow = m - 1, maxcol = n - 1;

        while (minrow <= maxrow && mincol <= maxcol) {

            // 1. Top row
            for (int j = mincol; j <= maxcol; j++) {
                ans.add(arr[minrow][j]);
            }
            minrow++;

            // 2. Right column
            for (int i = minrow; i <= maxrow; i++) {
                ans.add(arr[i][maxcol]);
            }
            maxcol--;

            // 3. Bottom row
            if (minrow <= maxrow) {
                for (int j = maxcol; j >= mincol; j--) {
                    ans.add(arr[maxrow][j]);
                }
                maxrow--;
            }

            // 4. Left column
            if (mincol <= maxcol) {
                for (int i = maxrow; i >= minrow; i--) {
                    ans.add(arr[i][mincol]);
                }
                mincol++;
            }
        }
        return ans;
    }

    // 🔹 Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows no. in Matrix: ");
        int m = sc.nextInt();
        System.out.println("Enter column no. in Matrix: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements in Matrix: ");
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Given Matrix is: ");
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        SpiralMatrix sm = new SpiralMatrix();
        List<Integer> result = sm.spiralOrder(arr);

        System.out.println("Spiral Order Traversal: " + result);
        sc.close();
    }
}
