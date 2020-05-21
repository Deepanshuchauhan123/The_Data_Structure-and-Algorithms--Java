import java.util.*;

class Print_only_odd{
 public static void main(String args[]) throws Exception {
  	int array[]=new int[5];
        int result;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
       
        for(int i=0;i<5;i++){
          printer(array,i);
        }
 //System.out.print("ddddd");
   }


   public static void printer(int array[],int n){
       for(int i=0;i<=n;i++){
           if(array[i]%2 != 0){
               System.out.print(array[i]);
               if(i<n-1){
                   System.out.print(" ");
               }
           }
    
       }
       // System.out.print("ddddd"); 
      //if(n<4){
                   System.out.print("\n");
            //   }
             
   }

   
}