package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Encoded_String {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            int test = sc.nextInt(), decimal;
            String str, demo;
            long n;
            for (int i = 0; i < test; i++) {
                n = sc.nextLong();
                str = sc.nextLine();
                for (int j = 0; j < n / 4; j++) {
                    demo = str.substring(j * 4, ((j + 1) * 4));
                    decimal = Integer.parseInt(demo, 2);
                    System.out.print((char) (97 + decimal));
                }
                System.out.println();
            }

        } catch (Exception e) {

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