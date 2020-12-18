import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hiring_Challenge_by_NortonLifeLock{

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> villians = new ArrayList<>();
        ArrayList<Integer> heroes = new ArrayList<>();

        int testcases = sc.nextInt(), n;
        for (int i = 0; i < testcases; i++) {
            int flag = 0;
            n = sc.nextInt();

            for (int j = 0; j < n; j++)
                villians.add(sc.nextInt());

            for (int j = 0; j < n; j++)
                heroes.add(sc.nextInt());

            Collections.sort(villians);
            Collections.sort(heroes);

            for (int j = 0; j < n; j++) {
                if (villians.get(j) > heroes.get(j)) {
                    System.out.print("LOSE");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print("WIN");
            }

        }
    }
}