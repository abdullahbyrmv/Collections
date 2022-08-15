public class User implements Comparable<User> {
    public int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User object) {
        int res = 0;
        if (object.age == this.age) {
            res = 0;
        } else if (object.age > this.age) {
            res = 1;
        } else if (object.age < this.age) {
            res = -1;
        }
        return res;
    }
}
