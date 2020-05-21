import java.util.*;

class Techgig_CodeGladiator_2020_round2{
    public static void main(String arr[]) {

       int N;
     int time;
    
        ArrayList<Integer> self = new ArrayList<Integer>();
        ArrayList<Integer> opp = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        time=sc.nextInt();
       for(int z=0;z<time;z++){

            N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            self.add(sc.nextInt());

        }
        for (int i = 0; i < N; i++) {
            opp.add(sc.nextInt());
               
        }
        Collections.sort(opp);
        Collections.sort(self);
//        System.out.println("    "+self);
//        System.out.println("    "+opp);
        System.out.println(rev(N, self, opp));
        self.clear();
        opp.clear();

      }

    }

    public static int rev(int N, ArrayList<Integer> self, ArrayList<Integer> opp) {
        
        int result=0;
        
        for (int i = 0,j=0; j < N || i<N; i++) {
      
                    while(j<N){
                        if(self.get(j)>opp.get(i)){
                        result++;
                        break;
                        }
                        j++;
                    }
                    j++;
        
        }
        return result;

    }

}