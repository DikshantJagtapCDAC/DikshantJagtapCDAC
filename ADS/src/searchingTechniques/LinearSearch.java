package searchingTechniques;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5,6,7,8,9}; //declaration, instantiation and initialization
        //int searchElement = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("LinearSearch: Please input a positive integer: " );
        int searchElement= sc.nextInt();
        int index = linearSearch(array, searchElement);
        if(index>=0) {
            System.out.println("Found the element at index: " + index);
        }else{
            System.out.println("Didnt find the element");
        }
    }
    private static int linearSearch(int[] array, int searchElement) {
        for(int index = 0; index < array.length; index++){
            if(array[index]== searchElement){
               return index;
            }
        }
        return -1;
    }
}
