package arrays;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // if (arr[i]>smax && arr[i]!=max) smax = arr[i];
            if (arr[i] != max)
                smax = Math.max(smax, arr[i]);
        }
        System.out.println("The minimum array is : " + min);
        System.out.println("The maximum array is : " + max);
        System.out.println("The second maximum array is : " + smax);
        sc.close();
    }
}
