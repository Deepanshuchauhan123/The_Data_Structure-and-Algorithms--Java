package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Longest_Increasing_Subsequence_Length {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            FastReader sc = new FastReader();


            System.out.println("Enter Sequence Length : ");
            int len = sc.nextInt();

            System.out.println("Enter Sequence : ");
            int arr[] = new int[len];

            for (int i = 0; i < len; i++)
                arr[i] = sc.nextInt();

            int seq_length = max_Increasing_Subsequence_Len(len, arr);

            System.out.println("The Longest possible increasing subsequence length is " + seq_length);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int max_Increasing_Subsequence_Len(int n, int arr[]) {

        int arr_seq_len[] = new int[n], max = 0;

        //initializing the complete array with 1, default length
        for (int i = 0; i < n; i++)
            arr_seq_len[i] = 1;


        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (arr[i] > arr[j] && arr_seq_len[j] + 1 > arr_seq_len[i])
                    arr_seq_len[i] = arr_seq_len[j] + 1;


        for (int i = 0; i < n; i++) 
            if (arr_seq_len[i] > max)
                max = arr_seq_len[i];
        
        return max;
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