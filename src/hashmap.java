import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Abdullah");
        students.put(2,"Abdullah2");
        System.out.println("First Person = " + students.get(1));
        System.out.println("Second Person = " + students.get(2));
    }
}
