/*
 * Worst-case performance	 O(n)
 * Best-case performance	O(1)
 * Average performance	O(log(log(n))) if the elements are  
   			uniformly distributed if not then O(n)
 * Worst-case space complexity	O(1)
*/
import java.util.*;

public class Interpolation_Searching{

    static int size, Array[];
    public static void main(String args[]) throws Exception {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        size=sc.nextInt();

        Array=new int[size];

        System.out.println("\nEnter Elements of Array");

        for(int i=0;i<size;i++)
        {
            Array[i]=sc.nextInt();
        }

        System.out.print("Enter Element to be Searched:");
        int key =sc.nextInt();
        int status=interpolation_Search(key);
        if(status == -1){
            System.out.println("Element not Found!!!!");
        }else{
            System.out.println("Element is found at Position "+(status+1));
        }

    }
    static int interpolation_Search(int key){
        int start=0,end=size-1,pos=0;

        while( start<=end && Array[start]<= key && Array[end]>=key){
            
            pos = start + ( ( (end-start) / (Array[end]-Array[start]) ) *(key - Array[start] ) );

            // if element matches with key then return the index of array
            if(Array[pos] == key)
            {
                return pos;
            }

            // if key is less than array element then search from start+1 to end
            // if key is small than value will fond at lower region
            if(Array[pos] < key)
            {
                start = pos+1;
            }else{
                end=pos-1;
            }
        }
        return -1;
    }
}