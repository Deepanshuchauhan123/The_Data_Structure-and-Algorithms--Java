import java.util.Scanner;

public class Hail_XOR {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        try {

        int t;
        t=sc.nextInt();


        while(t-- >0)
        {
        long  n, x,k;
        n=sc.nextInt();
        x=sc.nextInt();

        long  a[]=new long[1000000];

        for(long  i = 0; i < n; i++)
        {
        a[(int) i]=sc.nextInt();
        }

        long i = 0;

        for( k = x; k > 0 && i < n-1; k--)
        {
        int flag = 0;
        long  p = (long) (Math.log(a[(int) i])/ Math.log(2.0));
        long  r = 1 << p;
        a[(int) i] = a[(int) i] ^ r;

        for(long  j = i + 1; j < n; j++)
        {
        if((a[(int) j] ^ r) < a[(int) j])
        {
        a[(int) j] = a[(int) j] ^ r;
        flag = 1;
        break;
        }
        }

        if(flag == 0)
        {
        a[(int) (n - 1)] = a[(int) (n - 1)] ^ r;
        }

        while(a[(int) i] <= 0)
        {
        i++;
        }
        }
        long  z = k + 1;

        if(z > 0)
        {
        if((n < 3) && (z % 2 == 0) && z > 0)
        {
        a[(int) (n - 1)] = a[(int) (n - 1)] ^ 1;
        a[(int) (n - 2)] = a[(int) (n - 2)] ^ 1;
        }
        }

        for(long ii = 0; ii < n; ii++)
        {
        System.out.print(a[(int) ii]+" ");
        }

        System.out.println();
        }

    }catch (Exception e)
    {
        return;
    }
    }
}