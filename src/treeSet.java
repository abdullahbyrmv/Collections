import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("USA");
        set.add("Abdullah");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
