/* You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this-
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 
*/

import java.io.*;
import java.util.*;
class Pattern_Problem17{
    public static void main(String args[] ) throws Exception {

    	int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
                if( j!=n-i+1){
                    System.out.print(" ");
                }
            }
            if(i!=n){
                System.out.println("");
            }
        }

   }
}