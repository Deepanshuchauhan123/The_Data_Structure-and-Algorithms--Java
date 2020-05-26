

import java.io.*;
import java.util.*;
interface checker {

    boolean check(int n1, int num1);
}
class Advanced_Lambda_Checker{
    public static void main(String args[] ) throws Exception {

    	int t, n, num;
        checker a;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            num = sc.nextInt();
            a = (int n1, int num1) -> {
                if (n1 == 1) {
                    if (num1 % 2 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (n1 == 2) {
                    for (int j = 2; j <= num1 / 2; j++) {
                        if (num1 % j == 0) {
                            return false;
                        }
                    }
                    return true;
                } else if (n1 == 3) {
                    int r, sum = 0, temp;

                    temp = num1;
                    while (num1 > 0) {
                        r = num1 % 10;  //getting remainder  
                        sum = (sum * 10) + r;
                        num1 = num1 / 10;
                    }
                    if (temp == sum) {
                        return true;
                    } else {
                        return false;
                    }
                }

                return true;
            };
            if(n==1){
                if(a.check(n, num)){
                    System.out.print("EVEN");
                }else  System.out.print("ODD");
                
            }else if(n==2){
                if(a.check(n, num)){
                    System.out.print("PRIME");
                }else  System.out.print("COMPOSITE");
            }else if(n==3){
                if(a.check(n, num)){
                    System.out.print("PALINDROME");
                }else  System.out.print("NOT PALINDROME");
            }
            if( i !=t-1)
            System.out.println("");
        }

   }
}
