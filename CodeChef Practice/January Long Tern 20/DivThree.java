import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class DivThree {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            int test = sc.nextInt();
            long n, k, d, arr[], sum;
            for (int i = 0; i < test; i++) {
                sum = 0;
                n = sc.nextLong();
                k = sc.nextLong();
                d = sc.nextLong();

                for (int j = 0; j < n; j++)
                    sum += sc.nextLong();

                long val = sum / k;
                if (val < d) {
                    System.out.println(val);
                } else {
                    System.out.println(d);
                }
            }
        }catch (Exception e){

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