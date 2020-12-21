import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Self_Destructive_String{
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            int test;
            test = sc.nextInt();
            for (int i = 0; i < test; i++) {

                String str = sc.nextLine();

                long len = str.length(), count1 = 0, count0 = 0;

                for (int j = 0; j < len; j++) {
                    if (str.charAt(j) == '1') {
                        count1++;
                    } else {
                        count0++;
                    }
                }
                if (len % 2 != 0 || (count0 == 0 || count1 == 0)) {
                    System.out.println(-1);
                } else if (count0 == count1) {
                    System.out.println(0);
                } else {
                    System.out.println(count0 > count1 ? (count0 - count1) / 2 : (count1 - count0) / 2);
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