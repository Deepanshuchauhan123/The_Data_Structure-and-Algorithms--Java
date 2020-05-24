import java.util.*;

class Print_Divide_by_Five_in_tree_Form{

    public static void main(String arr[]) {
   	int array[]=new int[5];
        int result;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
       
        for(int i=0;i<5;i++){
          printer(array,i);
        }
// System.out.print("ddddd");
   }


   public static void printer(int array[],int n){
       for(int i=0;i<=n;i++){
           if(array[i]% 5 == 0){
               if(i!=0){
//                   if(i<n){
                   System.out.print(" ");
              // }
               }
               System.out.print(array[i]);
               
               
           }
    
       }
       // System.out.print("ddddd"); 
      if(n<4){
                   System.out.print("\n");
               }
             
   }
}
