import java.util.*;

class Limak_Catching_Criminals{

    public static void main(String arr[]) {
    
     int position,cities;
     
     int array[]=new int[100];
     Scanner sc=new Scanner(System.in);
     position=sc.nextInt();
     cities=sc.nextInt();
     for(int i=0;i<cities;i++){
         array[i]=sc.nextInt();
     }
     
        System.out.print(function(array,position,cities));    
    }
    
    public static int function(int array[],int position,int cities){
        
        int count =0;

        for(int i=position,j=position;i>=0 && j<cities;i--,j++){
            if(i >=0 && j<position){
                if(array[i]==1 && array[j]==1){
                    count++;
                }
            }else if(i>=0){
                if(array[i]==1){
                    count++;
                }
            }else if(j<position){
                if(array[j]==1){
                    count++;
                }
            }
        }
        return count+1;
    }
}