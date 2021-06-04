import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem187_RepeatedDnaSequences{


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = findRepeatedDnaSequences("AAAAAAAAAAAAA");
        for (String val : list)
            System.out.println(val);
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> list = new HashSet<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String substr = s.substring(i, i + 10);
            if (set.contains(substr))
                list.add(substr);
            else
                set.add(substr);
        }
        return new ArrayList<>(list);
    }
}