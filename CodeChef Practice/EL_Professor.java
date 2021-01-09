package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class EL_Professor {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            int t = sc.nextInt(), n, m, ii, jj, kk, arr[], sum;
            for (int i = 0; i < t; i++) {
                sum = 0;
                n = sc.nextInt();
                m = sc.nextInt();
                arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = 10;
                }
                for (int j = 0; j < m; j++) {
                    ii = sc.nextInt();
                    jj = sc.nextInt();
                    kk = sc.nextInt();

                    for (int k = ii - 1; k < jj; k++) {
                        arr[k] *= kk;
                    }
                }
                for (int j = 0; j < n; j++) {
                    sum += arr[j];
                }
                System.out.println(sum / n);

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