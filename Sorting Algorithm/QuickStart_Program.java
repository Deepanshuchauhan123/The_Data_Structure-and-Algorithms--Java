import java.util.*;

class QuickStart_Program{

    public static void main(String arr[]) {
  
        int n;

        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }

        Quick_Sort(array, 0, n - 1);
        System.out.println("After Insertation Sort: ");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }


    public static void Quick_Sort(int array[], int lowerbound, int upperbound) {

        if (lowerbound < upperbound) {
            int loc = partation(array, lowerbound, upperbound);
            Quick_Sort(array, lowerbound, loc - 1);
            Quick_Sort(array, loc+1, upperbound);
        }

    }

    public static int partation(int array[], int lowerbound, int upperbound) {
        int pivot = array[lowerbound];
        int start = lowerbound;
        int end = upperbound;

        while (start < end) {

            while (array[start] <= pivot) {
                start++;
            }
            while ((array[end] > pivot)) {
                end--;
            }

            if (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        int test=array[end];
        array[end]=array[lowerbound];
        array[lowerbound]=test;
        
        return end;
    }

}