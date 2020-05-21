import java.util.Scanner;

class Code_Gladiator_Round1{

   public static void main(String arr[]) {
        Long n,result=Long.valueOf(0);
        int test=0;
        Long max=Long.valueOf(0);
        Long Q[]=new Long[10000];
        Long A[]=new Long[10000];
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        for(int i=0;i<n;i++){
            Q[i]=sc.nextLong();
           
        }
        for(int i=0;i<n;i++){
            A[i]=sc.nextLong();
             if(A[i]>max){
                 max=A[i];
             }
        }
     
         for(int i=1;i<=max+1;i++){
           
             for(int j=0;j<n;j++){
                 if(Q[j]*i ==A[j]){
                     result=Long.valueOf(i);
                     test=1;
                     break;
                 }
             }
             if(test==1){
                 break;
             }
        }
        System.out.print(result);
   
    }
}