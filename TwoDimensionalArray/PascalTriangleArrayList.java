package TwoDimensionalArray;

import java.util.*;

class PascalTriangleArrayList {
    
    // Function to generate Pascal's Triangle
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();  // final answer list

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();  // ek row banayenge

            for (int j = 0; j <= i; j++) {
                // Har row ka first & last element hamesha 1 hota hai
                if (j == 0 || j == i) {
                    l.add(1);
                } else {
                    // Middle elements = upar wali row ke 2 elements ka sum
                    l.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(l);  // row ko final list me add karo
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        PascalTriangleArrayList pt = new PascalTriangleArrayList();
        List<List<Integer>> result = pt.generate(n);

        // Directly pura Pascal’s Triangle ek hi list ke form me print hoga
        System.out.println(result);

        sc.close();
    }
}
