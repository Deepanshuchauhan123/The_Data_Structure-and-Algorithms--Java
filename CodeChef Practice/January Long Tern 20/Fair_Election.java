package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Fair_Election{
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader sc = new FastReader();
            int test = sc.nextInt();
            long arrn[],arrm[],sumn,summ;
            long n,m;
            int count=0,flag=0;
            for (int i = 0; i < test; i++)
            {
                n=sc.nextLong();
                m=sc.nextLong();
                summ=sumn=0;
                count=flag=0;
                arrn=new long[(int) n];
                arrm=new long[(int) m];
                for(int j=0;j<n;j++) {
                    arrn[j] = sc.nextLong();
                    sumn+=arrn[j];
                }
                for(int j=0;j<m;j++){
                    arrm[j]=sc.nextLong();
                    summ+=arrm[j];
                }
                if(sumn>summ){
                    System.out.println(0);
                    flag=1;
                }else{
                    Arrays.sort(arrn);
                    Arrays.sort(arrm);
                    for(int j=0;j<n;j++)
                    {

                        sumn=summ=0;
                        long temp = arrn[j];
                        arrn[j] = arrm[(int) (m-j-1)];
                        arrm[(int) (m-j-1)] = temp;

                        for(int k=0;k<n;k++){
                            sumn+=arrn[k];
                        }
                        for(int k=0;k<m;k++){
                            summ+=arrm[k];
                        }
                       // System.out.println(count+" gg");
                        count++;
                        if(sumn>summ){
                            flag=1;
                            System.out.println(count);
                            break;
                        }
                    }
                }
                if(flag==0){
                    System.out.println(-1);
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