package arrays.practice1;
import java.util.Arrays;

public class prac {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 2, 0, 0, 1, 1, 0, 0, 2, 2, 0 };
        int n = arr.length;
        int mid = 0, low = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            }
            if (arr[mid] == 1) {
                mid++;
            }

            if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
