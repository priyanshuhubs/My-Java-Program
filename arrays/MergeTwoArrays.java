// merge two sorted arrays one single arrays
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]>a[j])  {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
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
        System.out.println("The First Array is: " + Arrays.toString(a));
        bubbleSort(a);
        System.out.println("The Acsending Order of First Array is: " + Arrays.toString(a));
        System.out.print("Enter size of Second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.print("Enter elements Second array: ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("The Second Array is: " + Arrays.toString(b));
        bubbleSort(b);
        System.out.println("The Acsending Order of Second Array is: " + Arrays.toString(b));
        // Merging
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0; 
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) { // now take elements from b only
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (j == b.length) { // now take elements from a only
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        System.out.println("The Sorted Merged Array For First and Second Array is: " + Arrays.toString(c));

        sc.close();
    }
}
