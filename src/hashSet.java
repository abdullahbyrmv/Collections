import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();// unique
        mySet.add("USA");
        mySet.add("Abdullah");

        for (String s : mySet) {
            System.out.println(s);
        }

        for (Iterator<String> iterator = mySet.iterator(); iterator.hasNext(); ) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
