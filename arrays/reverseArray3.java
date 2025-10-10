package arrays;

public class reverseArray3 {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 40, 56, 34, 32, 54, 43, 22 };
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // int i = 0; 
        // int j = 5;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
