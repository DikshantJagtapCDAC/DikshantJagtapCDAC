package Recursion;

class RecursionSimpleExample {

    static void RecursionFun(int data)
    {
        if (data < 1)
            return;
        else {
            System.out.printf("%d ", data);
            RecursionFun(data - 1);
            System.out.printf("%d ", data);
            return;
        }
    }

    public static void main(String[] args)
    {
        int test = 4;
        RecursionFun(test);
        //4 3 2 1 1 2 3 4
        System.out.println("End ");
    }
}
