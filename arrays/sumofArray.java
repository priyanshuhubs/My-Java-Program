package arrays;

public class sumofArray {
    public static void main(String[] args) {
        int arr[] = { 2, 5,63,3,5,2,4 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
