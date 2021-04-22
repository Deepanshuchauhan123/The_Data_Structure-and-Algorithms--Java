import java.util.Scanner;

class Problem_151_ReverseWords{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String value;
            System.out.println("Enter String = ");
            value = sc.nextLine();
            System.out.println(reverse_words(value));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static String reverse_words(String s) {

        StringBuffer sb = new StringBuffer();
        int i, j;
        i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ')
                i--;
            else {
                j = i;
                while (i >= 0 && s.charAt(i) != ' ')
                    i--;
                if (sb.length() != 0)
                    sb.append(' ');
                for (int k = i + 1; k <= j; k++)
                    sb.append(s.charAt(k));
            }
        }

        return sb.toString();
    }
}