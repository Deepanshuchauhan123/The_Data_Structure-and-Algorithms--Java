// hidden number
package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Hidden_Number{
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            long test,num,a,b;
            test=sc.nextInt();
            for(int i=0;i<test;i++)
            {
             num=sc.nextInt();
             if(num%2==0)
             {
                 a=2;
                 b=num/2;
             }else
             {
                 a=1;
                 b=num;
             }
             System.out.println(a+" "+b);

            }

        } catch (Exception e) {
            return;
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

