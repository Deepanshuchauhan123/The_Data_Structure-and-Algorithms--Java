import java.util.Scanner;

class uppercase_and_lowercase{
 public static void main(String ar[]) {

        String lines;
        int upr=0,low=0,len;
        Scanner sc=new Scanner(System.in);
        lines=sc.nextLine();
      
        len=lines.length();

        
        for(int i=0;i<lines.length();i++){
            if(lines.charAt(i)>=65 && lines.charAt(i)<=90){
                upr++;
             }else if(lines.charAt(i)>=97 && lines.charAt(i)<=122 ){
                 low++;
             }
            
        }
        System.out.print(upr+"\n"+low);
}
}