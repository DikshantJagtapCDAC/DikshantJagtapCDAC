import java.util.Arrays;

public class GrowableArray {

    private int array[];
    private int index;
    private int capacity;

    public GrowableArray(int capacity) {
        this.array = new int[capacity];
        index=0;
    }

    public void add(int data){
        if(index<array.length) {
            //array is not full
            array[index++] = data;
        }else{
            //array is full and need to provision more space
            int newArray[] = new int[array.length*2];
            //copy old elements to new array
            for(int i =0;i<array.length;i++){
                newArray[i] = array[i];
            }

            array = newArray;
            array[index++] = data;
        }
    }

    @Override
    public String toString() {
        return "GrowableArray{" +
                "array=" + Arrays.toString(array) +
                ", index=" + index +
                ", capacity=" + capacity +
                '}';
    }

    public static void main(String[] args) {
        GrowableArray g = new GrowableArray(5);
        System.out.println(g);
        g.add(1);
        g.add(2);
        g.add(3);
        g.add(4);
        g.add(5);
        g.add(6);
        System.out.println(g);
    }

}
