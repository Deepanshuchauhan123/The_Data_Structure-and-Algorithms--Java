import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class AmongUs_CSTR2020 {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            long n, arr[], arr2[];
            n = sc.nextLong();
            arr = new long[(int) n];
            arr2 = new long[(int) (n + 1)];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            for (int j = 0; j < n + 1; j++) {
                arr2[j] = sc.nextLong();
            }
            int ans = 0;

            // Find the XOR of all the element
            // of array A[] and array B[]
            for (int i = 0; i < n; i++)
            ans ^= arr[i];


            for (int i = 0; i < n + 1; i++)
                ans ^= arr2[i];
            System.out.print(ans + " ");

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