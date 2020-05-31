// Ternary Search

import java.util.*;

class Ternary_Search{

    public static void main(String arr[]) {
        int n, s, value;

        int array[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Count Of Inputs");
        n = sc.nextInt();

        System.out.println("Enter Total Numbers ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Element To be Searched: ");
        s = sc.nextInt();

        //Function Calling
        value = Ternary(s, array, 0, n);

        if (value >= 0) {
            System.out.println("Element Found at " + (value + 1));

        } else {
            System.out.println("Element Not Found");
        }

    }

    public static int Ternary(int search, int array[], int start, int end) {

        if (start <= end) {
            int firstmid = (start + (end - start) / 3);
            int secondmid = (firstmid + (end - start) / 3);
            if (array[firstmid] == search) {
                return firstmid;
            }
            if (array[secondmid] == search) {
                return secondmid;
            }
            if (search < array[firstmid]) {
               return Ternary(search, array, start, firstmid - 1);
            }
            if (search > array[secondmid]) {
               return Ternary(search, array, secondmid + 1, end);
            }

            return Ternary(search, array, firstmid + 1, secondmid - 1);
        } else {
            return -1;
        }
    }
}