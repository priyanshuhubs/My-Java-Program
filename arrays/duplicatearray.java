package arrays;

public class duplicatearray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 3, 2, 2, 5, 6, 8, 9, 5, 3, 5, 8 };
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    visited[i] = true;
                    visited[j] = true;
                    break;
                }
            }
        }
    }
}
