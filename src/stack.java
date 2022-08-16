import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("Abdullah");
        stack.add("Abdullah2");
        stack.push("USA");
        stack.push("USA2");
        stack.push("USA3");

        System.out.println(stack.peek());
        stack.pop();

        System.out.println();
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
