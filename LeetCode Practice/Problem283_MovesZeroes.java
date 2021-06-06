public class Problem283_MovesZeroes{

    public static void main(String[] args) {
        int arr[] = new int[]{0, 0, 9, 0, 9, 9};
        moveZeroes(arr);
        for (int val : arr)
            System.out.print(val);
    }

    public static void moveZeroes(int[] nums) {
        for (int i = -1, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[++i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}