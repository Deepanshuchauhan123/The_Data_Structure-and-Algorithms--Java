import java.util.Scanner;

class LinearSearch{
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
        result = linearsearch(search, size, array);
        if(result<size){
            System.out.print("Element found at index "+(result+1));
        }else
        {
            System.out.print("\n Element Not Found");
        }

    }

    public static int linearsearch(int search, int size, int array[]) {
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == search){
                break;
            }
        }
        return i;
    }
}