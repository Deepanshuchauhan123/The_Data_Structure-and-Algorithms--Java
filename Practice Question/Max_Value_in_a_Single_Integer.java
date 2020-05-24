import java.util.*;

class Max_Value_in_a_Single_Integer{

public static void main(String ar[]){
    	int n,max=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i!=0;i=i/10){
            if(i%10 >max){
                max=i%10;
            }
        }
        System.out.print(max);
   }
}