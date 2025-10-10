package arrays;

public class doubleeee {
    public static void main(String[] args) {
        // // double[] arr = {242.2,32.1,33,3,22,2,};
        // // System.out.print(arr+" ");
        // ArrayList<Integer> arr = new ArrayList<>(6);
        // arr.add(0, 10);
        // arr.add(1, 20);
        // arr.add(2, 30);
        // arr.add(3, 40);
        // arr.add(4, 50);
        // arr.add(5, 60);
        // for (int i = 0; i <= 5; i++) {
        // System.out.print(arr.get(i) + " ");
        // }
        // System.out.println(arr);

        int[] arr = { 1, 2, 4, 6, 4, 32, 2 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
