import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        Map<Integer,String> treemap = new TreeMap<>();
        treemap.put(1,"Abdullah");
        treemap.put(10000,"Abdullah2");
        treemap.put(100,"USA");
        System.out.println(treemap.values());
        System.out.println(treemap.keySet());
    }
}
