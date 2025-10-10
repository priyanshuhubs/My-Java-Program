package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class merge2 {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of First array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.print("Enter elements for the First array: ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of Second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.print("Enter elements Second array: ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("The First Array is: " + Arrays.toString(a));
        bubbleSort(a);
        System.out.println("The Acsending Order of First Array is: " + Arrays.toString(a));
        System.out.println("The Second Array is: " + Arrays.toString(b));
        bubbleSort(b);
        System.out.println("The Acsending Order of Second Array is: " + Arrays.toString(b));

        // Merging
        int[] c = new int[a.length + b.length];
        int i = n1 - 1, j = n2 - 1, k = (n1 + n2) - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                c[k] = a[i];
                i--;
                k--;
            } else {
                c[k] = b[j];
                j--;
                k--;
            }
        }
        while (i >= 0) { // now take elements from b only

            c[k] = a[i];
            i--;
            k--;
        }

        while (j >= 0) { // now take elements from a only

            c[k] = b[j];
            j--;
            k--;

        }
        System.out.println("The Sorted Merged Array For First and Second Array is: " + Arrays.toString(c));

        sc.close();
    }
}
