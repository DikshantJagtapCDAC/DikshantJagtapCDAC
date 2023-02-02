package searchingTechniques;


import java.io.*;
import java.util.*;

public class IterativeBinarySearch {

    static void binarySearch(int array[], int searchElement) {
        int low = 0, high = array.length - 1;
        while ((high - low) > 1) {
            int mid = (high + low) / 2;
            if (searchElement> array[mid]  ) {
                low = mid + 1;
            } else {
               high = mid;
            }
        }
        if (array[low] == searchElement) {
            System.out.println("Found At Index " + low);
        } else if (array[high] == searchElement) {
            System.out.println("Found At Index " + high);
        } else {
            System.out.println("Not Found");
        }
    }


    public static void main(String[] args) {

        int array[] = {1, 3, 4, 5, 6};

        int searchElemnt = 1;
        binarySearch(array, searchElemnt);
        searchElemnt = 6;
        binarySearch(array, searchElemnt);
        searchElemnt = 4;
        binarySearch(array, searchElemnt);
        searchElemnt = 10;
        binarySearch(array, searchElemnt);
    }
}
