package loop;
import java.util.Scanner;
public class nthtermap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
    int n = sc.nextInt();  
for(int i=1;i<=2*n-1;i+=2){
System.out.println(i);
}
sc.close();
    }
}


