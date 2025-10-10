package arrays;

public class mergeoppo {
    public static void main(String[] args) {
        int[] a = { 11, 33, 42, 71 };
        int n = a.length;
        int[] b = { 26, 54, 69, 81 };
        int m = b.length;
        int[] c = new int[n + m];
        int i = n - 1;
        int j = m - 1;
        int k = (n + m) - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                c[k] = a[i];
                i--;
            } else {
                c[k] = b[j];
                j--;
            }
            k--;

        }

        while (j >= 0) {
            c[k] = b[j];
            k--;
            j--;
        }
        while (i >= 0) {
            c[k] = a[i];
            k--;
            i--;
        }
        for (int ele : c) {
            System.out.print(ele + " ");
        }

    }
}
