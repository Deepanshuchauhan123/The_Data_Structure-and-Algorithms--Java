import java.io.*;
import java.util.*;
public class Sorting_Sorting_Sorting{
    public static void main(String args[] ) throws Exception {

       int n;

        int array[] = new int[100];
        int array1[] = new int[100];

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            array1[i]=array[i];
        }

        selection_Sort(array, n,array1);

    }

    public static void selection_Sort(int array[], int len,int array1[]) {
        int min,test=0,count=0;
        for (int i = 0; i < len-1; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {

                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if(i != min){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }

        for (int k = 0; k < len; k++) {

            if(array[k]%5==0){
                count++;
                if(k!=0 && count != 1){
                    System.out.print(" ");
                }
                System.out.print(array[k]);
                test=1;
            }
        }
        for(int z=0;z<len;z++){
            if(array1[z]%5!=0){
                if(test==0 && z==0){

                }else{
                    System.out.print(" ");
                }


                System.out.print(array1[z]);

            }
        }

    }
}