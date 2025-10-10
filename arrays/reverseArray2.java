package arrays;

public class reverseArray2 {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 40, 56, 34, 32 };
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int i = 0;
        int j = n - 1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
