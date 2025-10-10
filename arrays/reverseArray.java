package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 40, 56, 34, 32 };
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int i = 0; i < n/2; i++) {
            int j = n - 1 - i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
