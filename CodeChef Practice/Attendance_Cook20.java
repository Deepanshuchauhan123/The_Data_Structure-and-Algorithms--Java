import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Attendance_Cook20 {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            int test;
            test = sc.nextInt();
            for (int i = 0; i < test; i++) {

                int days = sc.nextInt(), count1 = 0;
                String str = sc.nextLine();

                for (int j = 0; j < days; j++) {

                    if (str.charAt(j) == '1') {
                        count1++;
                    }
                }

                if (90 - (count1 + 120 - days) <= 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
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