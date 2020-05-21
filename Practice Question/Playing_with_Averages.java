import java.util.*;

class Playing_with_Averages{

    public static void main(String args[]) throws Exception {
        
       	int even=0,odd=0,n,t1=0,t2=0;
        double averageeven,averageodd,ceven=0,codd=0;
        int array[]=new int[1000];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if(array[i]%2==0){
                even=even+array[i];
                ceven++;
            }else{
                odd=odd+array[i];
                codd++;
            }
        }
      
        if(ceven==0 ){
            ceven=1;
        }
        if(codd==0 ){
            codd=1;
        }
       
        averageeven=even/ceven;
        averageodd=odd/codd;
       
        t1=(int)averageeven;
         t2=(int)averageodd;
   
        
        if((averageeven-Double.valueOf(t1))>=0.5){
            t1++;
        }        
        if((averageodd-Double.valueOf(t2))>=0.5){
             t2++;
        }
        
              System.out.print(t1+t2);
       
           
           }
}
