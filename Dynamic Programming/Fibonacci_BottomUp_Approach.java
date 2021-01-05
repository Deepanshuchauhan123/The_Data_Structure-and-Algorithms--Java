package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Fibonacci_BottomUp_Approach{
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            int num = sc.nextInt();
            
            System.out.println(num + "th Fibbonaci Number is = " + fib(num));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int fib(int num) {
        int arr[] = new int[num + 1];
        arr[1] = 1;
        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[num];
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