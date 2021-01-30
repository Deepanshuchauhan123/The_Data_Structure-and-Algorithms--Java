package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Even_Sum{
    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();
            int test, n, arr[], sum;
            test = sc.nextInt();
            for (int i = 0; i < test; i++) {
                sum = 0;
                n = sc.nextInt();
                arr = new int[n];

                for (int j = 0; j < n; j++) {
                    arr[j] = sc.nextInt();
                        sum=sum+arr[j];

                }
                System.out.println(sum%2==0 ? "1" :"2");
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