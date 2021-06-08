import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChefHeist{

    public static void main(String[] args) {
        long test, D, d, P, Q;
        FastReader sc = new FastReader();
        test = sc.nextInt();
        try {
            for (int i = 0; i < test; i++) {
                D = sc.nextLong();
                d = sc.nextLong();
                P = sc.nextLong();
                Q = sc.nextLong();
                long n = D / d, total = d * n * P + d * Q * (((n - 1) * n) / 2);
                if (D % d != 0)
                    total += (D % d) * (P + n * Q);
                System.out.println(total);
            }
        } catch (Exception e) {
        }
    }
}
    class FastReader {
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
