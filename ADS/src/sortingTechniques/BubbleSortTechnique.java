package sortingTechniques;

import java.util.Arrays;

public class BubbleSortTechnique {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int iteration;
        for (int i = 0; i < n - 1; ++i) {
            boolean swapped = false;
            iteration=i;
            for (int j = 0; j < (n - i - 1); ++j) {
                if (array[j] > array[j + 1]) //check if adjacent element is not in order
                {
                    //swap(arr[j], arr[j + 1]);
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            // Value at n-i-1 will be maximum of all the values below this index.
            if (!swapped) {
                System.out.println("Nothing got swapped at iteration# :" + iteration);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {8, 1, 3, 7, 4, 5, 6, 2};
        BubbleSortTechnique.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        int array2[] = {7,1,2,3,4,5,6,6};
        BubbleSortTechnique.bubbleSort(array2);
        System.out.println(Arrays.toString(array2));

    }
}

