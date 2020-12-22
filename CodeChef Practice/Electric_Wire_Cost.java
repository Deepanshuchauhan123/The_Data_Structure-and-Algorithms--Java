package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Electric_Wire_Cost {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            long test;
            test = sc.nextLong();
            for (int i = 0; i < test; i++) {
                int n, arr[], sum = 0;
                n = sc.nextInt();
                arr = new int[(int) n];

                for (int j = 0; j < n; j++) {
                    arr[j] = sc.nextInt();
                    sum += arr[j];
                }
                int n1 = arr.length;
                int x = findGCD(arr, n1);
                System.out.println(x + " " + sum / x);

            }
        } catch (Exception e) {
        }

    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    
    static int findGCD(int arr[], int n) {
        int result = 0;
        for (int element : arr) {
            result = gcd(result, element);

            if (result == 1) {
                return 1;
            }
        }

        return result;
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

    }
}