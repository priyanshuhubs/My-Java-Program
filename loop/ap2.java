package loop;

import java.util.Scanner;

public class ap2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
    int n = sc.nextInt(); 
   int a = 4 , d =3; 
for(int i=1;i<=n;i++){
System.out.print(a+" ");
a += d;
}
sc.close();
    } 
}
