package TwoDimensionalArray;

public class foreach {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        for(int[] ele:arr){
            for(int x :ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
