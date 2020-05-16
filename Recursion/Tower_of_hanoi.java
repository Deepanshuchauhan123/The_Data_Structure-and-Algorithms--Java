import java.util.*;

class Tower_of_hanoi{
//Tower of Hanoi Problem

    public static void main(String arr[]) {

        //Here Integer type number of disc in the tower of hanoi
        int disc;

        System.out.print("Number of Disc in Tower of Hanoi: ");

        //Taking input using scanner class of the number of disc
        Scanner scan = new Scanner(System.in);
        disc = scan.nextInt();

        //calling a recursion 
        //Here From Tower A to Tower C movement of the discs using Tower B
        Towerofhanoi(disc, 'A', 'c', 'B');
    }

    public static void Towerofhanoi(int disc, char left, char right, char middle) {

        if (disc == 0) {
            return;
        } else {
            //Firstly this execute completely
            Towerofhanoi(disc - 1, left, middle, right);

            //then This execute after completing of above function call
            System.out.println("Move Disc from " + left + " to " + right);

            //At last this function make call
            Towerofhanoi(disc - 1, middle, right, left);
        }
    }
}
