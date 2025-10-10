package arrays;

import java.util.ArrayList;

public class basicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);
        System.out.println();
        System.out.println("size of array = " + arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.set(2, 300);
        System.out.println(arr);

        arr.add(90);
        System.out.println("size of array = " + arr.size());
        System.out.println(arr);
    }
}
