import java.util.HashMap;
import java.util.Scanner;

class Problem1_Two_Sum{

    public static void main(String arr2[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        arr = twoSum(arr, target);
        System.out.println(arr[0] + "     " + arr[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment))
                return new int[]{map.get(compliment), i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match");
    }