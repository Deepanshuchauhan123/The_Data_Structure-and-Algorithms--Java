import java.util.*;

class Exception_handler {

    public static void main(String args[]) throws Exception {
        
 
      
    

        int a1, b1;
        Long result;
        Scanner sc = new Scanner(System.in);
        MyCalculator c = new MyCalculator();
        for (int i = 0; i < 4; i++) {
            a1 = sc.nextInt();
            b1 = sc.nextInt();
            
            result = c.power(a1, b1, i + 1);
            if (result == -1) {

            } else {
                if (i == 1) {
                    System.out.print(result);
                } else {
                    System.out.print("\n"+result);
                }
            }
        }

    }
}

class MyCalculator {

    Long result;

    public Long power(int a, int b, int l) {
        result = Long.valueOf(1);
        try {
            if (a < 0 || b < 0) {
                throw new Exception("n or p should not be negative.");
            } else if (a == 0 && b == 0) {
                throw new Exception("n and p should not be zero.");
            }
            for (int i = 0; i < b; i++) {
                result = result * a;
            }
            if (a == 0) {
                return Long.valueOf(0);
            }
            return result;

        } catch (Exception e) {
            if (l == 1 ) {
                System.out.print(e);
            } else {
                System.out.print("\n"+e);
            }
        }
        return Long.valueOf(-1);
    }
}