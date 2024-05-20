package lesson37;

public class User {
    private long ID;
    private String name;
    private int age;

    public User(long ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(User u) {
        return Long.compare(this.ID, u.ID) ;
    }
}
