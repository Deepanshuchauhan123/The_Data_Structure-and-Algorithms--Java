//problem Statement
//https://www.hackerrank.com/challenges/maximum-element/problem

package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Maximum_Element_Stack {
    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();
            int test = sc.nextInt();
            int[] stack = new int[test], stack2 = new int[test];
            int choice, top = -1, max = -100;
            for (int i = 0; i < test; i++) {
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        stack[++top] = sc.nextInt();
                        if (max == -100) {
                            max = stack[top];
                            stack2[top] = max;
                        } else {
                            if (stack2[top - 1] < stack[top]) {
                                stack2[top] = stack[top];
                            } else {
                                stack2[top] = stack2[top - 1];
                            }
                        }
                        break;
                    case 2:
                        top--;
                        if (top == -1) {
                            max = -100;
                        }
                        break;
                    case 3:
                        System.out.println(stack2[top]);
                        break;
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