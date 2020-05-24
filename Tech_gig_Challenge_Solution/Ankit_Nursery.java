import java.util.*;
class Ankit_Nursery{

    public static void main(String arr[]) {
        int n, min = 1000,sum;
        int array[] = new int[1000];

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int j = 0; j < n; j++) {
                sum=0;
                min=1000;
            for (int i = 0; i < 3; i++) {
                array[i] = sc.nextInt();
                if(array[i]<min){
                    min=array[i];
                }
                sum=sum+array[i];
            }
//             System.out.println("min  "+min);
//              System.out.println("sum  "+sum);
            fun(array,min,sum);
        }

    }
    public static void fun(int array[],int min,int sum){
        int count=0,result=1;
                for(int i=min;i>0;i--){
                    count=0;
                    for(int j=0;j<3;j++){
                        
                        if(array[j]% i==0){
                            count++;
                        }
                    }
                  //  System.out.println("Count  "+count);
                    if(count == 3){
                        result=i;
                        System.out.print(result+" ");
                        break;
                    }
                }
                System.out.println(sum/result);
        
    }
}