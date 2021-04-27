import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Problem3_LengthofLongestSubString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            String value;
            System.out.println("Enter String = ");
            value = sc.nextLine();
            System.out.println(lengthofLongestSubString(value));
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static int lengthofLongestSubString(String s)
    {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++)
        {
            if (map.containsKey(s.charAt(j)))
                i = Math.max(map.get(s.charAt(j)), i);
            ans = Math.max(j - i + 1, ans);
            map.put(s.charAt(j), j + 1);
        }
        return ans;

    }

}