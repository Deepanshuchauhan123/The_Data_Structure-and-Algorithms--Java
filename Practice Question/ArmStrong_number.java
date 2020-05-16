import java.util.Scanner;

class ArmStrong_number{
   public static void main(String ar[]) {

        int temp, next, result = 0, value;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number");
        value = sc.nextInt();

        for (int i = value; i > 0; i = i / 10) {
            temp = i % 10;

            next = temp * temp * temp;
            result = result + next;

        }
        if (result == value) {
            System.out.print(result + " is a ArmStrong number   ");
        } else {
            System.out.println(result + " is Not a ArmStrong number   ");
        }

    }
}