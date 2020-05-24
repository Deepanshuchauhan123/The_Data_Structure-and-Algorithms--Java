
import java.util.*;

class Total_Greater_numbers_than_given_Number{

    public static void main(String arr[]) {

        int n, test = 0, num,index=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        num = sc.nextInt();
        Collections.sort(list);
        
        
            for (int i = 0; i < n; i++) {
              if(list.get(i) > num){
                    index=i;

                    break;
                }
            }
     

        System.out.print(n-index);
    }
}