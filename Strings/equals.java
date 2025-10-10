package Strings;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c += "xyz";
        System.out.println(s);
        System.out.println(c);
        System.out.println(s==a);
        System.out.println(s==b);
        System.out.println(s==c);

        System.out.println(s.equals(b));
        System.out.println(s.compareTo(c));
    }
}
