/*
Reaching Nth stair using steps 1,2,3

Time Complexity : O(n)
Space Complexity : O(n)
*/

package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Reaching_Nth_Stair_using_Bottom_Up_Approach{
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            //Taking input of upto which stair we have to reach

            System.out.println("Enter stair number you want reach : ");
            int stair_number = sc.nextInt();

            //Using Top Down Approach of Dynamic Approach
            int ways = numberOf_Ways(stair_number);

            System.out.println("The Total number of ways in which we can reach "+stair_number+"th stair using 1,2,3 steps are = "+ways);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int numberOf_Ways(int n) {

        int arr[] = new int[n+1];
        arr[0]=arr[1]=1;
        arr[2]=2;

        for(int i=3;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
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