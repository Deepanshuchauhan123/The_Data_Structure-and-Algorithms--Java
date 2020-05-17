import java.util.*;

class Sorted_Words{
    public static void main(String ar[]) {

        int N,j=0;

        System.out.println("Enter Total number of elements to be sorted");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter String words here::");
        List<String> lang=new ArrayList<String>(); 
        for (int i = 0; i < N; i++) {
           lang.add(i, sc.nextLine());
        }
         Collections.sort(lang);  
       System.out.println("Output with sorted String WOrds:");
          for (String num : lang) { 		      
           System.out.print(num); 
           j++;
           if( j!=N){
               System.out.print("\n");
           }
           
      }
          

    }
}
