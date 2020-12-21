import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Theif_Police_Cook20 {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            int test;
            test = sc.nextInt();
            for (int i = 0; i < test; i++) {

                long x, y, k, n, value;
                double flag = 0.0;
                x = sc.nextInt();
                y = sc.nextInt();
                k = sc.nextInt();
                n = sc.nextInt();

                if (x > y) {

                    value = x - y;
                    if (value % k == 0) {
                        if ((value / k) % 2 == 0)
                            System.out.println("Yes");
                        else
                            System.out.println("No");
                    } else {
                        System.out.println("No");
                    }
                } else if (x < y) {
                    value = (x - y);
                    if (value % k == 0) {
                        if ((value / k) % 2 == 0)
                            System.out.println("Yes");
                        else
                            System.out.println("No");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("Yes");
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