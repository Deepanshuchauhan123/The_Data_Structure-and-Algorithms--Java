import java.util.Scanner;

public class Anangram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        // System.out.println(a+"\n"+b);
        char arr1[] = a.toCharArray();
        java.util.Arrays.sort(arr1);
        char arr2[] = b.toCharArray();
        java.util.Arrays.sort(arr2);
        int count = 0;
        for (int i = 0; i < ((a.length() > b.length()) ? b.length() : a.length()); i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        if (count == b.length() && b.length() == a.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}