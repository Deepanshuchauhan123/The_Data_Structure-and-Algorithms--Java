import java.util.Scanner;

class BinarySearch{

public static void main(String ar[]) {

        int size, search, result;
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        size = sc.nextInt();
        //Input of Array
        System.out.println("Enter elements of Array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter Number to searched:  ");
        search = sc.nextInt();
        
        result=binarysearch(search,array,0,size);
        if(result==-1){
            System.out.print("Number Not Found ");
        }else
        System.out.println("Element Found at "+(result+1)+" position");

    }

    public static int binarysearch(int search,int array[],int start,int last) {
        
        int mid=(start+last)/2;
        
        if(array[mid]==search)
            return mid;
        else
        if(start==last){
            return (-1);
        }else
         if(array[mid]>search){
           return binarysearch(search,array,start,mid-1);
        }else if(array[mid]<search){
            return binarysearch(search,array,mid+1,last);
        }
        
        return -1;
        
    }
}