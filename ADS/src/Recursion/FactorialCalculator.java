package Recursion;

public class FactorialCalculator {

    public long factorial(int n) {
        if (n == 0) {
            return 1;
        }else {
            long factorial = factorial(n - 1);
            return n * factorial;
        }
    }

    public static void main(String[] args) {
        System.out.println(new FactorialCalculator().factorial(4));
    }

}

//1 * factorial(0) => 1
//2 * (1)factorial(1) =>2
//3 * (2)factorial(2) => 6
//4 * (6)factorial(3) => 24
