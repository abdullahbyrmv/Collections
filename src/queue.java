import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("Abdullah");
        queue.add("Abdullah2");
        queue.offer("USA");
        queue.offer("USA2");
        queue.offer("USA3");

        System.out.println(queue.peek());
        queue.poll();

        System.out.println();
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
