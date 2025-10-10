package Strings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "pqr";
         s += t + 10+'p';
         s = 10+s;
        System.out.println(s);

        System.out.println("abc"+10+20);
        System.out.println(10+20+"Abc");
    }
}
