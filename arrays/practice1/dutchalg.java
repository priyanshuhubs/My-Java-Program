package arrays.practice1;
import java.util.Scanner;

public class dutchalg {
    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in array(0,1,2 only): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mid = 0, low = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1)
                mid++;
            else { // arr[mid]== 2
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();

    }
}
