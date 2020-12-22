package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Delhi_Even_ODD {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            long l, num, even, odd, val;
            l = sc.nextLong();
            for (int i = 0; i < l; i++) {
                num = sc.nextLong();
                even = 0;
                odd = 0;
                while (num > 0) {
                    val = num % 10;
                    if (val % 2 == 0) {
                        even += val;
                    } else {
                        odd += val;
                    }
                    num /= 10;
                }
                if (even % 4 == 0 || odd % 3 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }

        } catch (Exception e) {
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        Long nextLong() {
            return Long.parseLong(next());
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