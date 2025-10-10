package arrays.practice1;
import java.util.Scanner;

public class roateeArray {
    public static void rotate(int[] nums,int k) {
       int n = nums.length;
       k = k%n;
       reverse(nums,0,n-k-1) ;
       reverse(nums,n-k,n-1);
       reverse(nums,0,n-1);
    }
    public static void reverse(int[] nums,int i, int j ) {
        while (i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the target number for how time to rotate array: ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr,k);
        for(int ele:arr)
        System.out.print(ele+" ");
        sc.close();
    }
}
