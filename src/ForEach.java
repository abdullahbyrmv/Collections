import java.util.ArrayList;
import java.util.Iterator;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("For-Each Version : ");
        for (Integer s : list) {
            System.out.println(s);
        }
        System.out.println("");

        //-------------------------------------------------

        System.out.println("While Version : ");
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer s = iter.next();
            System.out.println(s);
        }
    }
}
