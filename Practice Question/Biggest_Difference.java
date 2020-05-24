import java.io.*;
import java.util.*;
class Biggest_Difference{
    public static void main(String args[] ) throws Exception {

        int n;
        ArrayList<Integer> list=new ArrayList<>();
    	Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        System.out.print(list.get(n-1)-list.get(0));

   }
}