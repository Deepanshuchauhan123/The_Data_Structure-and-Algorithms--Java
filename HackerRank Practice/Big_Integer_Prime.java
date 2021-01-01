import java.math.BigInteger;
import java.util.Scanner;

class Big_Integer_Prime 
{
    public static void main(String[] args) throws java.lang.Exception 
    {
        Scanner sc = new Scanner(System.in);

        BigInteger a=sc.nextBigInteger();

        if(a.isProbablePrime(1))
        {
            System.out.println("prime");
        }else
            {
            System.out.println("not prime");
            }

    }
}