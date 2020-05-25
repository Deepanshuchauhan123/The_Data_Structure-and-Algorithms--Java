import java.util.*;

class Largest_Even{

    public static void main(String arr[]) {
        int n;
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int i = n - 1; i > 0; i--) {

            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i));
                break;

            }
        }

    }
}