package CollectionFrameWork;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after pop: " + stack);
    }
}
