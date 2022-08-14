import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();// unique
        mySet.add("USA");
        mySet.add("Abdullah");

        for(String s : mySet){
            System.out.println(s);
        }
    }
}
