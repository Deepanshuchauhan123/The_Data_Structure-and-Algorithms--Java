class Indirect_Recursion{
    public static void main(String arr[]){
     int num=1;
     
     odd(num);
     
     
    
    }
    public static void odd(int num){
        if(num <=10){
            System.out.print((num+1)+" ");
            even(num+1);
        }
        else return;
    }
    public static void even(int num){
        
       if(num <=10){
            System.out.print((num-1)+" ");
            odd(num+1);
        }
        else return; 
    }
}