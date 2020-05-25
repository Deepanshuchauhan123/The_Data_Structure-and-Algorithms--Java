import java.io.*;
import java.util.*;
class Difference_Of_Even_and_Odd{
    public static void main(String args[] ) throws Exception {

    	 int n,even=0,odd=0,sub;
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            if(list.get(i)%2==0){
                even=even+list.get(i);
            }
             if(list.get(i)%2!=0){
                odd=odd+list.get(i);
            }
        }
    sub=even-odd;
    if(sub<0){
        System.out.print(-sub);
    }else
    System.out.print(sub);

   }
}