public class Problem66_PlusOne{
    
    public static void main(String[] args) {
        int arr[]=new int[]{9,9,9,9,9};
        arr=plusOne(arr);
        for(int val:arr)
        System.out.print(val);
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length-1,carry,value;
        value=(digits[n]+1);
        digits[n]= value%10;
        carry=value/10;
        for(int i=n-1;i>=0 && carry>0;i--)
        {
            value=(digits[i]+carry);
            digits[i]= value%10;
            carry=value/10;
        }
        if(carry>0){
            int arr[]=new int[n+2];
            arr[0]=carry;
            for(int i=1;i<=n+1;i++)
                arr[i] = digits[i - 1];
            return arr;
        }
        return digits;
    }
}