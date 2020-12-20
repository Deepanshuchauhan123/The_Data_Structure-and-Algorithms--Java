import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Array_Swap_UWCOI21B{
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            int n = sc.nextInt(), m = sc.nextInt();
            int a[] = new int[n], b[] = new int[m];
            for(int i = 0; i < n; i++)a[i] = sc.nextInt();
            for(int i = 0; i < m; i++)b[i] = sc.nextInt();
            Arrays.sort(a); //Arrays.sort(b);
            long ans = 0;
            for(int i = 0; i < m; i++){
                if(b[i] < a[0])
                    ans += n;
            }
            System.out.println(ans);
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
        Long nextLong(){return  Long.parseLong(next());}
    }
}