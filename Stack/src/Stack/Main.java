package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
            StackLL<String> stack = new StackLL<>();
            stack.push("Test");
            stack.push("Rest");
            stack.push("Fast");
            System.out.println(stack.pop()); // Must return Fast
            System.out.println(stack.pop()); // Must return Rest
            System.out.println(stack.pop()); // Must return Test
            System.out.println(stack.pop()); // Throws an exception
    }
}