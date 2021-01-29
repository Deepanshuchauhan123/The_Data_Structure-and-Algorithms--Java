package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Horoscope_Matrix {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int m;
        int n;
        int[][] matrix;
        int count = 0;
        int q;
        int x;
        int y;
        int v;
        int old;
        m = sc.nextInt();
        n = sc.nextInt();

        matrix = new int[m][n];

        //inputting matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //counting mismatched positions
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1])
                    count++;
            }
        }
        q = sc.nextInt();

        while (q != 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            v = sc.nextInt();

            x--;
            y--;

            old = matrix[x][y];
            matrix[x][y] = v;
            if (x - 1 >= 0 && y - 1 >= 0) {
                if (matrix[x - 1][y - 1] == v && old != v) {
                    count--;
                }
            }
            if (x + 1 < m && y + 1 < n) {
                if (matrix[x + 1][y + 1] == v && old != v) {
                    count--;
                }
            }

            if (x - 1 >= 0 && y - 1 >= 0) {
                if (matrix[x - 1][y - 1] != v && matrix[x - 1][y - 1] == old) {
                    count++;
                }
            }
            if (x + 1 < m && y + 1 < n) {
                if (matrix[x + 1][y + 1] != v && old == matrix[x + 1][y + 1]) {
                    count++;
                }
            }

            System.out.println(count == 0 ? "Yes" : "No");
            q--;
        }
        
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}