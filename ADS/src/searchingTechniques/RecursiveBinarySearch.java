package searchingTechniques;
// Java implementation of recursive Binary Search
public class RecursiveBinarySearch {
    // Returns index of x if it is present in arr[low..
    // high], else return -1
    int binarySearch(int arr[], int low, int high, int searchElement) {
        if (high >= low) {
            int mid = ((low + high) / 2);
            System.out.println("middle index,low,high: " + mid + "," + low + "," + high);
            // If the element is present at the
            // middle itself
            if (arr[mid] == searchElement)
                return mid;
            if (searchElement>arr[mid]) {
                // Else the element can only be present   // in right subarray
                return binarySearch(arr, mid + 1, high, searchElement);
            }
            // If element is smaller than mid, then  // it can only be present in left subarray
            return binarySearch(arr, low, mid - 1, searchElement);
        }
        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        RecursiveBinarySearch obj = new RecursiveBinarySearch();
        int arr[] = {1, 2, 3, 4, 6, 7, 8, 9, 10, 20, 30, 40};
        int n = arr.length;
        int searchElement = 10;
        int result = obj.binarySearch(arr, 0, n - 1, searchElement);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

