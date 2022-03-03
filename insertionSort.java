// Insertion sort in Java

import java.util.Arrays;

public class insertionSort {

    static void InsertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step]; // current element
            int j = step - 1; //previous element

            // Compare key with each element on the left of it until an element smaller than
            // it is found.

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    // Driver code
    public static void main(String args[]) {
        int[] data = { 3, 2, 8, 1};
        InsertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
