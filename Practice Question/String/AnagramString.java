import java.util.*;

class AnagramString{

    public static void main(String arr[]) 
    {
        Scanner sc = new Scanner(System.in);
        String mainString = sc.nextLine();
        String sampleString = sc.nextLine();

        if(anagrams(mainString.toLowerCase().trim().toCharArray(),sampleString.toLowerCase().trim().toCharArray(),mainString.length()))
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are not Anagram");
    }

    public static boolean anagrams(char[] main, char[] sample, int len) 
    {
        int table[] = new int[26];

        if(main.length!=sample.length)
            return false;

        for(int i=0;i<len;i++)
            table[((int)main[i])-97]++;

        for(int i=0;i<len;i++)
            if(--table[((int)sample[i])-97] <0)
                return false;

        return true;
    }
}