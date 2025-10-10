package TwoDimensionalArray;

import java.util.*;

public class ArrayListTwoD {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);
        b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
        // for (int i = 0; i <a.sixe(); i++) {
        // System.out.print(a.get(i)+" ");
        // }

        // for (int i = 0; i < l.size(); i++) {
        // System.out.print(l.get(i));
        // }

        // System.out.println("To get the element in l list second row of second
        // element: " + l.get(1).get(1));

        System.out.println("Array list of l : ");
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}