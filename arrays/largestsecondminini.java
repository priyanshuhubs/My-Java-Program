package arrays;

import java.util.Scanner;

public class largestsecondminini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println("The maximum array is : " + max);


        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > smax && arr[i] != max)
                smax = arr[i];
        }
        System.out.println("The second maximum array is : " + smax);


         int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(arr[i], min);
        }
        System.out.println("The minimum array is : " + min);

        int smin = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]<smin&&arr[i]!=min) smin = arr[i];
        }
         System.out.println("Second minimum Element is: "+smin);
        sc.close();
    }
}
