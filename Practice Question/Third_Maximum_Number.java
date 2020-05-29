

import java.io.*;
import java.util.*;
public class Third_Maximum_Number{
    public static void main(String args[] ) throws Exception {

    	 int n;
         ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<n;i++){
          list.add(sc.nextInt());
          }
        Collections.sort(list);
       
        for(int i=1;i<list.size();i++){
         
        if(list.get(i-1)==list.get(i)){
          
            list.remove(i-1);
        }

        }
     
            System.out.print(list.get(list.size()-3));

   }
}
