package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Reaching_Nth_Stair_using_Top_Down_Approach {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            //Taking input of upto which stair we have to reach

            System.out.println("Enter stair number you want reach : ");
            int stair_number = sc.nextInt();

            int arr[] = new int[stair_number+1];

            //Using Top Down Approach of Dynamic Approach
            int ways = numberOf_Ways(stair_number,arr);

            System.out.println("The Total number of ways in which we can reach "+stair_number+"th stair using 1,2,3 steps are = "+ways);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int numberOf_Ways(int n, int arr[]) {

        if(n==0 || n==1)
            return 1;
        if(n==2)
            return 2;
        if(arr[n]==0)
        {
            arr[n] = numberOf_Ways(n-1,arr)+numberOf_Ways(n-2,arr)+numberOf_Ways(n-3,arr);
        }
        return arr[n];
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