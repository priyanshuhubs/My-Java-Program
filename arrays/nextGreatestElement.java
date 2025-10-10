package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nextGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of  array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] ans  = new int[n];
        ans[n-1] = -1; 
        // method 1 : Brute Force
        // for(int i=0;i<n-1;i++){
        //     int mx = Integer.MIN_VALUE;
        //     for(int j =i+1;j<n;j++){ 
        //         mx = Math.max(mx, arr[j]);
        //     }
        //     ans[i] = mx;
        // }


        // Method 2: Optimize
        int nge = arr[n-1];
        for(int i =n-2;i>=0;i--){
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }
        System.out.println("The Array is: " + Arrays.toString(arr));
        System.out.println("The Array is: " + Arrays.toString(ans));

        sc.close();
    }
}
