package arrays;

import java.util.ArrayList;

public class ArrayLiatAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+" "+"size of array: "+list.size());  
        list.add(60);
        System.out.println(list+" "+"size of array: "+list.size());
        list.add(20);
        System.out.println(list+" "+"size of array: "+list.size());
        list.add(204);
        System.out.println(list+" "+"size of array: "+list.size());
        list.add(-45);
        System.out.println(list+" "+"size of array: "+list.size());
        list.remove(1);
        System.out.println(list+" "+"size of array: "+list.size());
    }
}
