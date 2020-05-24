
import java.util.*;

class Check_Consecutive_Numbers{

    public static void main(String arr[]) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        int n, test = 0, count = 0, num = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }

        if (array.get(0) - array.get(1) == 1) {
            num = 1;
        } else {
            num = -1;
        }
        Collections.sort(array);
        if (n == 1) {
            System.out.print("False");
            test = 1;
        } else {
            for (int i = 0; i < n - 1; i++) {

                if (array.get(0) - array.get(1) == num) {

                } else {
                    System.out.print("False");
                    test = 1;
                    break;
                }
            }
        }

        if (test == 0) {
            System.out.print("True");
        }

    }
}