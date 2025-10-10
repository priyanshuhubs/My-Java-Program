package Merge_Sort;

public class Merge2Array {
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])  c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (j<b.length) c[k++] = b[j++];
        while (i<a.length) c[k++] = a[i++];

    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 46, 67, 89, 90 };
        int[] b = { 21, 43, 55, 67, 89 };
        int[] c = new int[a.length + b.length];
        merge(a, b, c);
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
