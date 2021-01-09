package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Minimum_Cost_Matrix {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            long t = sc.nextInt(), n, m, arr[][];
            while (t-- != 0) {
                n = sc.nextLong();
                m = sc.nextLong();
                arr = new long[(int) n][(int) m];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        arr[i][j]  = sc.nextLong();
                    }
                }
                
                long dp[][] = new long[(int) n][(int) m];

                for (int i = dp.length - 1; i >= 0; i--) {
                    for (int j = dp.length - 1; j >= 0; j--) {
                        if (i == dp.length - 1 && j == dp.length - 1) {
                            dp[i][j] = arr[i][j];
                        } else if (i == dp.length - 1) {
                            dp[i][j] = dp[i][j + 1] + arr[i][j];
                        } else if (j == dp.length - 1) {
                            dp[i][j] = dp[i + 1][j] + arr[i][j];
                        } else {
                            dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
                        }
                    }
                }

                System.out.println(dp[0][0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
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