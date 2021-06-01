import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Max_Occuring_ValueInArray {
    public static void main(String ar[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[]{2, 2, 3, 3, 4, 5, 3, 7, 6, 4, 1, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                count++;
                map.put(arr[i], count);
            } else
                map.put(arr[i], 1);
        }
        int max = 0, value = 0;
        for (Map.Entry<Integer, Integer> val : map.entrySet())
            if (max < val.getValue()) {
                max = val.getValue();
                value = val.getKey();
            }

        System.out.println(value);
    }