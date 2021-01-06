package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Subset_Sum {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();
            System.out.println("Enter total numbers ");
            int num = sc.nextInt();
            System.out.println("Enter numbers of list ");
            int arr[] = new int[num];
            for (int i = 0; i < num; i++)
                arr[i] = sc.nextInt();
            System.out.println("Subset-sum : ");
            int sum = sc.nextInt();

            System.out.println("\nSubset with sum " + sum + " is " + isSubsetExists(arr, sum));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isSubsetExists(int arr[], int sum) {
        if (arr.length == 0)
            return false;

        boolean[][] dp = new boolean[arr.length][sum + 1];

        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = true;
        }

        for (int j = 0; j <= sum; j++) {
            if (arr[0] == j) {
                dp[0][j] = true;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (dp[i - 1][j]) {
                    dp[i][j] = true;
                } else {
                    if (j >= arr[i]) {
                        dp[i][j] = dp[i - 1][j - arr[i]];
                    }
                }
            }
        }

        return dp[arr.length - 1][sum];
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