package problemSolving;

public class LinearSearch {

    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5,6,7,8,9}; //declaration, instantiation and initialization
        int searchElement = 10;
        int index = linearSearch(array, searchElement);
        if(index>=0) {
            System.out.println("Found the element at index: " + index);
        }else{
            System.out.println("Didnt find the element");
        }
    }

    private static int linearSearch(int[] array, int searchElement) {
        for(int index = 0; index < array.length; index++){
            if(array[0]== searchElement){
               return 0;
            }
        }
        return -1;
    }
}
