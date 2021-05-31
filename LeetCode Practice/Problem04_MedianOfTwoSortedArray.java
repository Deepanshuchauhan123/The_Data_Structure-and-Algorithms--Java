import java.util.Scanner;

class Problem04_MedianOfTwoSortedArray{
    public static void main(String ar[]) {

        Scanner sc = new Scanner(System.in);

        int arr1[] = new int[]{2, 3, 4, 5};
        int arr2[] = new int[]{1};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int low = 0, high = nums1.length, l1, l2, r1, r2, cut1, cut2;
        while (low <= high) {
            cut1 = low + (high - low) / 2;
            cut2 = ((nums1.length + nums2.length) / 2) - cut1;

            l1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            r1 = cut1 == nums1.length ? Integer.MAX_VALUE : nums1[cut1];
            r2 = cut2 == nums2.length ? Integer.MAX_VALUE : nums2[cut2];
            if (l1 > r2)
                high = cut1 - 1;
            else if (l2 > r1)
                low = cut1 + 1;
             else
                return (nums1.length + nums2.length) % 2 == 0 ? (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2 : Math.min(r1, r2);
        }
        throw new IllegalArgumentException("No match found!");
    }
}