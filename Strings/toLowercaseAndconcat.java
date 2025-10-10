package Strings;

public class toLowercaseAndconcat {
    public static void main(String[] args) {
        String s = "Priyanshu is a Student";
        System.out.println(s.toLowerCase());

        String x = "He is Watching Anime";
        // x.toLowerCase(); --> nothing change in string
        x = x.toLowerCase();
        System.out.println(x);
        System.out.println(x.toUpperCase());

        String a = "abc";
        String b = "xyz";
        // a.concat(b); -> nothing
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);

    }
}
