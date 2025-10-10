package Strings;

public class append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abc");
        System.out.println(s);
        s.append(35);
        System.out.println(s);
        s.append('x');
        System.out.println(s);
        char[] ch = {'r','a','g'};
        s.append(ch);
        System.out.println(s);
        int[] arr = {1,2,3,4,5,6};
        s.append(arr);
        System.out.println(s);
    }
}
 