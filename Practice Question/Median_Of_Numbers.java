import java.io.*;
import java.util.*;
class Median_Of_Numbers{
    public static void main(String args[] ) throws Exception {

    	    int n,mean;
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        if(n%2!=0){
            System.out.print(list.get((n/2)));
        }else{
            mean=list.get(n/2)+list.get((n/2)-1);
            System.out.print(mean/2);
        }

   }
}