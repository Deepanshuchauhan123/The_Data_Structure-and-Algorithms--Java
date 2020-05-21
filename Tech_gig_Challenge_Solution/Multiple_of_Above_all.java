import java.util.Scanner;

class Multiple_of_Above_all{

 public static void main(String args[] ) throws Exception {

    	int array[]=new int[5];
        int result;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
        result=array[0];
        for(int i=1;i<5;i++){
            result=array[i]*result;
            System.out.println(result);
        }

   }
}