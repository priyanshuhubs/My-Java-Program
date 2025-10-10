package Stack.Stack3;

import java.util.Stack;

class CelebrityProblem {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if (mat[v1][v2] == 0)
                st.push(v1);
            else
                st.push(v2);
        }

        if (st.isEmpty())
            return -1;
        int potential = st.pop();

        for (int j = 0; j < n; j++) {
            if (mat[potential][j] == 1)
                return -1;
        }
        for (int i = 0; i < n; i++) {
            if (i == potential)
                continue;
            if (mat[i][potential] == 0)
                return -1;
        }

        return potential;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 1, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 1 } };

        CelebrityProblem sol = new CelebrityProblem(); 
        int celeb = sol.celebrity(mat);

        if (celeb == -1) {
            System.out.println("No Celebrity Found");
        } else {
            System.out.println("Celebrity is Person: " + celeb);
        }
    }
}
