import java.io.*;
import java.util.*;
class Find_Location_Of_Points{
    public static void main(String args[] ) throws Exception {
	  	int a,x,y;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        if(x<=a && y==0 ||y<=a && x==a ||x<=a && y==a || y==a && x==a || x==0 && y<=a|| y==0 && x==0){
            System.out.print(1);
        }else
    if(x<a && y<a && x>0 && y>0){
            System.out.print(0);
        }else
      {
            System.out.print(2);
    }

   }
}