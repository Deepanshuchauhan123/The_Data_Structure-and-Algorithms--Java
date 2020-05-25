
import java.io.*;
import java.util.*;
class Even_Gets_Bigger{
    public static void main(String args[] ) throws Exception {

    	int n, test=0;
        int array[]=new int[1000];

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(array[i]%2==0){
                System.out.print(array[i]);
                test=1;
            }
        }
        if(test==0){
            System.out.print(0);
        }

   }
}