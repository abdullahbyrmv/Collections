import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Abdullah");
        deque.add("Abdullah2");
        deque.add("Abdullah3");
        deque.add("Abdullah4");

        System.out.println("size : " + deque.size());
        System.out.println("peek : " + deque.peek());
        System.out.println("first : " + deque.getFirst());
        System.out.println("last : " + deque.getLast());
        deque.poll();
        deque.pop();

        System.out.println();
        for (String s : deque) {
            System.out.println(s);
        }
    }
}
