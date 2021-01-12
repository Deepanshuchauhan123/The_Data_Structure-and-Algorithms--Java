import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Billboard_Play {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            int test = sc.nextInt();
            long n, k, x, y, val, min, t1, t2, s2, s1, max;

            for (int i = 0; i < test; i++) {
                n = sc.nextLong();
                k = sc.nextLong();
                x = sc.nextLong();
                y = sc.nextLong();
                val = k % 4;
                if (x == y) {
                    System.out.println(n + " " + n);
                } else {
                    min = x > y ? y : x;
                    t1 = x - min;
                    t2 = y - min;
                    max = x > y ? x : y;
                    s1 = (n - max) + x;
                    s2 = (n - max) + y;
                
                    if (val == 0) {
                        System.out.println(t1 + " " + t2);
                    } else if (val == 1) {
                        System.out.println(s1 + " " + s2);
                    } else if (val == 2) {
                        System.out.println(s2 + " " + s1);
                    } else if (val == 3) {
                        System.out.println(t2 + " " + t1);
                    }

                }


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

       
    }
}