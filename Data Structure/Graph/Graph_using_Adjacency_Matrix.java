package Test_Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Graph_using_Adjacency_Matrix
{
    public static void main(String[] args)
    {
        try
        {
            FastReader sc = new FastReader();
            int[][] graph;
            int vertex, edges, vertex1, vertex2;

            System.out.print("Enter total Vertex in the graph : ");
            vertex = sc.nextInt();
            graph = new int[vertex][vertex];
            System.out.print("\nEnter total number of Edges: ");
            edges = sc.nextInt();

            System.out.println("\nEnter Connectivity between nodes: Enter A and B values: ");
            for (int i = 0; i < edges; i++) {
                vertex1 = sc.nextInt();
                vertex2 = sc.nextInt();

                graph[vertex1 - 1][vertex2 - 1] = 1;
            }

            System.out.println("Graph's adjacency matrix is :");

            for (int i = 0; i <= vertex; i++) {
                for (int j = 0; j <= vertex; j++) {
                    if (i == 0 && j == 0)
                        System.out.print("  ");
                    else if (i == 0)
                        System.out.print((char) (64 + j) + " ");
                    else if (j == 0)
                        System.out.print((char) (64 + i) + " ");
                    else
                        System.out.print(graph[i - 1][j - 1] + " ");
                }
                System.out.println();
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