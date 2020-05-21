import java.util.*;

class Binary_To_Decimal {

    public static void main(String args[]) throws Exception {
        
        String s=new String();
        int length,num=0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        length=s.length();
        
        for(int i=length-1,j=1;i>=0;i--,j=j*2){
            if((s.charAt(i))=='0'){
        }else{
                num=num+j;
            }
        }
        System.out.println(num);
    }
}