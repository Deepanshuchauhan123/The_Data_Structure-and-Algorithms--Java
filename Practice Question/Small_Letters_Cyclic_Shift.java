import java.util.Scanner;

public class Small_Letters_Cyclic_Shift{

    public static void main(String[] args) {

        char array[];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       
        array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                array[i] = 'z';
            } else
                array[i] = (char) (s.charAt(i) - 1);
        }
        for (int i = 0; i < s.length(); i++) {

            System.out.print(array[i]);
        }

    }
}