// Fubd the doublet in the Array whose sum is equal
// to the given value x.(two sum)
package arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr = { 3, -1, 8, 5, 4, 9, 2 };
        int x = 9;
        // sol
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
    }
}
