package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Zebra_Spit_Problem {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            long t = sc.nextInt(), pos[], spit[], sum = 0, flag = 0;
            spit = new long[(int) t];
            pos = new long[(int) t];
            for (int i = 0; i < t; i++) {

                pos[i] = sc.nextLong();
                spit[i] = sc.nextLong();

            }
            for (int i = 0; i < t - 1; i++) {
                for (int j = i + 1; j < t; j++) {
                    if (pos[i] + spit[i] == pos[j] && pos[j] + spit[j] == pos[i]) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
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