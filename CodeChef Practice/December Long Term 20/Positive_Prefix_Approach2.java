
import java.util.Scanner;

public class Positive_Prefix_Approach2 {

    public static void main(String[] args) throws java.lang.Exception {
        int testCase, count, N, K, array[], sum = 0, diff;

        Scanner sc = new Scanner(System.in);

        try {

            testCase = sc.nextInt();
            for (int i = 0; i < testCase; i++) {

                N = sc.nextInt();
                K = sc.nextInt();
                array = new int[N];

                if(N%2==0){
                    for (int j = 1; j <= N; j++){
                        if (j % 2 == 0) {
                            array[j - 1] = j;
                        } else {
                            array[j - 1] = -j;
                        }
                    }
                }else
                {
                    for (int j = 1; j <= N; j++){
                        if (j % 2 != 0) {
                            array[j - 1] = j;
                        } else {
                            array[j - 1] = -j;
                        }
                    }
                }

                count = N / 2;
                for (int j = 0; j < N; j++)
                {
                    sum = sum + array[j];
                    if (sum > 0) {
                        if (count < K) {
                            diff = K - count;

                            for (j = N - 1; j > 0 && diff > 0; j--) {
                                if (array[j] < 0) {
                                    array[j] = -array[j];
                                    diff--;
                                    count++;
                                }
                            }
                            if (count == K)
                                break;
                        } else if (count > K) {
                            diff = count - K;

                            for (j = N-1; j > 0 && diff > 0; j--) {
                                if (array[j] > 0) {
                                    array[j] = -array[j];
                                    diff--;
                                    count--;
                                }
                            }
                            if (count == K)
                                break;
                        }
                    }
                }
                for (int j = 0; j < N; j++) {
                    System.out.print(array[j] + " ");
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}