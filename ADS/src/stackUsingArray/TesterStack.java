package stackUsingArray;

public class TesterStack {

    public static void main(String[] args) {
        try {
            Stack stack = new Stack(10);
            System.out.println(stack.isEmpty()); //true
            stack.push(5);
            stack.push(4);
            stack.push(6);
            stack.push(10);
            //5 4 6 10
            System.out.println(stack.isEmpty()); //false
            System.out.println(stack.peek());    //10
            //5 4 6 10
            System.out.println(stack.pop()); //10
            //5 4 6
            System.out.println(stack.peek()); //6
            //5 4 6
            System.out.println(stack.pop()); //6
            //5 4
            System.out.println(stack.pop()); //4
            //5
            System.out.println(stack.pop()); //5
            //

            System.out.println(stack.pop()); //RTE with message stack is empty

            stack.push(5); //5
            stack.push(4); //5 4
            stack.push(6); // 5 4 6
            stack.push(10); // 5 4 6 10
            stack.push(20); //  5 4 6 10 20
            stack.push(30); //RTE with message stack is full
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}


