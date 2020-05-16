import java.util.*;

public class Recursion_in_array {

    public static void main(String[] args) {

        int array[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = scan.nextInt();
        }
        showarray(array,0);

    }

    public static void showarray( int array[], int i) {
        if(i>=10){
            return;
        }
         System.out.print(" "+array[i]);
        showarray(array,i+1);
        
       
    }

}