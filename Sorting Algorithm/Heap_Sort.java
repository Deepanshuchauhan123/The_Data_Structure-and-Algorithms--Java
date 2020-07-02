/*
Heap Sort :  Heapsort is a comparison-based sorting algorithm. 
	   Heapsort can be thought of as an improved selection sort: like selection sort,
	  Heapsort divides its input into a sorted and an unsorted region.

		Worst complexity: n*log(n)
		Average complexity: n*log(n)
		Best complexity: n*log(n)
		Space complexity: 1
		Method: Selection
		Stable: No
*/
import java.util.Scanner;

public class Heap_Sort{

    public static void main(String[] args)
    {

        int size, array[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of elements ");
        size = sc.nextInt();
        array = new int[size];
        System.out.print("\nEnter " + size + " Elements ");
        for (int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }

        // Calling heapsort and passing unsorted elements
        heapSort(array, size);

        // Printing After Sorting
        System.out.println("\nElements after Heap Sort ");
        printArray(array, size);

    }

    public static void heapSort(int array[], int size)
    {
        // For Max Heapify the elements
        // Starting from (size/2-1) because we start heapify only non-leaf nodes such that O(N) time
        // Leaf Nodes are by default heapify

        for (int i = size / 2 - 1; i >= 0; i--)
        {
            maxHeapify(array, size, i);
        }

        // For Delete Element and send it to its Right position
        // Starting from last because we delete root node and root is the biggest value and send it to last position and rest are now unsorted.

        for (int i = size - 1; i >= 0; i--)
        {
            // Swap Root Node with its right position
            swap(array, i, 0);

            // Again calling maxHeapify so that rest elements should maintain Heapify property
            maxHeapify(array, i, 0);
        }
    }

    public static void maxHeapify(int array[], int size, int i) {

        //Considering i element as largest and check it with its child
        int largestElement = i;

        // Formula to find child node of parents in complete binary Tree
        int leftElement = 2 * i + 1;
        int rightElement = 2 * i + 2;

        // Comparing that if parent is bigger than its child
        // Checking if child exist
        if (leftElement < size && array[largestElement] < array[leftElement]) {
            largestElement = leftElement;
        }
        if (rightElement < size && array[largestElement] < array[rightElement]) {
            largestElement = rightElement;
        }

        // if Child are bigger than parent than swap the child and parent value
        // Then again calling maxHeapify.
        if (i != largestElement) {
            swap(array, largestElement, i);
            maxHeapify(array, size, largestElement);
        }
    }

    // Swap function to swap the values
    public static void swap(int array[], int largest, int i) {
        int temp;
        temp = array[i];
        array[i] = array[largest];
        array[largest] = temp;
    }

    // Printing the Array
    public static void printArray(int array[],int size){
        for (int i = 0; i < size; i++)
        {
            if (i != 0)
            {
                System.out.println("");
            }
            System.out.print(array[i] + " ");
        }
    }

}