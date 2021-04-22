import java.util.Scanner;

class Problem_344_reverseString{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String value;
            System.out.println("Enter String = ");
            value = sc.nextLine();
            char arr[] = value.toCharArray();
            reverse_String(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void reverse_String(char arr[]) {
        char c;
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            c = arr[left];
            arr[left] = arr[right];
            arr[right] = c;
        }
        System.out.println(arr);
    }
}