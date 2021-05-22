import java.util.Scanner;

class Counting_Inversion_using_MergeSort{

    public static void main(String arr2[]) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {12, 11, 13, 5, 6, 7};
        Counting_Inversion_using_MergeSort m = new Counting_Inversion_using_MergeSort();
        int inversions = m.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Number of inversions are "+inversions);

    }

    public int mergeSort(int arr[], int left, int right) 
    {

        int count = 0;

        if (left < right) 
        {
            int mid = (left + right) / 2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += mergeSortAndCount(arr, left, mid, right);
        }
        return count;
    }

    public int mergeSortAndCount(int arr[], int left, int mid, int right) 
    {
        int swap = 0;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Extra space 
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
                arr[k] = L[i++];
            else {
                arr[k] = R[j++];
                // swaps will equal to number of elements left in first array 
                swap += (mid + 1) - (left + i);
            }
        }

        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];

        return swap;
    }

}