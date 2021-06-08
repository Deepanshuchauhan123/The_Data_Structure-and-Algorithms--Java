import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NthStair_SpaceOptimized{

    public static void main(String[] args) {
        int steps = 1, stair_number, first, second, third;
        FastReader sc = new FastReader();
        stair_number = sc.nextInt();
        try {
            first = 1;
            second = 2;
            third = 4;
            for (int i = 4; i <= stair_number; i++) {
                steps = first + second + third;
                first = second;
                second = third;
                third = steps;
            }
            if (stair_number > 3)
                System.out.println(steps);
            else if (stair_number == 2)
                System.out.println(second);
            else
                System.out.println(third);
        } catch (Exception e) {
        }
    }
}

class FastReader {
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
}
