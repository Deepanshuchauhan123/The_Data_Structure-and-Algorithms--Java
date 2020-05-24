import java.util.*;

class Square_Root{

    public static void main(String arr[]) {

int num,temp,sr;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
    sr=num/2;
    do{
        temp=sr;
        sr=(temp +(num/temp))/2;
    }while(sr-temp !=0);
System.out.print(sr);
   }
}