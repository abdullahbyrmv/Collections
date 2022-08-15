import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public static void arrayList() {
        ArrayList<String> list = new ArrayList<>(10);// 10 is initial capacity not the size
        list.add("Abdullah");
        list.add("Abdullah2");
        list.add("Abdullah3");
        list.add("Abdullah4");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void linkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Abdullah");
        list.add("Abdullah2");
        list.add("Abdullah3");
        list.add("Abdullah4");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void Vector() {
        Vector<String> list = new Vector<>(10);
        list.add("Abdullah");
        list.add("Abdullah2");
        list.add("Abdullah3");
        list.add("Abdullah4");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // Alternative of Vector (SynchronizedList)
    List<String> list = new LinkedList<>();
    List<String> mySynchronizedList = Collections.synchronizedList(list);
    List<String> sync = Collections.synchronizedList(new ArrayList<>());
    Collection<Integer> collection = Collections.synchronizedList(new LinkedList<>());
}
