package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class SubTract_Problem {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            long num,t;
            num=sc.nextLong();
            t=sc.nextLong();

            for(int i=0;i<t;i++){
                if(num%10>0){
                    num=num-1;
                }else{
                    num/=10;
                }
            }
            System.out.println(num);

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