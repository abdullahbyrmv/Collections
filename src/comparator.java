import java.util.*;

public class comparator {
    public static void main(String[] args) {
        Comparator<User> myComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                User u1 = (User) o1;
                User u2 = (User) o2;
                int res = 0;
                if (u1 == u2) {
                    res = 0;
                } else if (u1.age < u2.age) {
                    res = -1;
                } else if (u1.age > u2.age) {
                    res = 1;
                }
                return res;
            }
        };

        List<User> list = Arrays.asList(new User(3), new User(-9), new User(5), new User(1));
        List<User> myList = new ArrayList<>();
        myList.add(new User(3));
        myList.add(new User(4));
        myList.add(new User(5));
        myList.add(new User(-1));
        myList.add(new User(9));

        Collections.sort(list, myComparator);

        for (User u : list) {
            System.out.println(u.age);
        }

        System.out.println();
        System.out.println();

        Collections.sort(myList, myComparator);
        for (int i = 0; i < myList.size(); i++) {
            User u = myList.get(i);
            System.out.println(u.age);
        }


        System.out.println();
        System.out.println();

        Collections.sort(list);
        for (User u : list) {
            System.out.println(u.age);
        }

        System.out.println();
        System.out.println();

        System.out.println(myComparator.compare(new User(10), new User(15)));
    }
}
