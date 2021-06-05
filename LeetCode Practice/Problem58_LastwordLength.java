public class Problem58_LastwordLength{

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("AAAAAAAAAAAAA "));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) != ' ') count++;
            else if (count > 0)
                return count;
        return count;
    }
}