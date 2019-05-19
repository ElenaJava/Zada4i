public class Friend {
    String name;
    int age;
    char sex;

    public Friend(String name) {
        this.name = name;

    }
    public Friend(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public Friend(String name, int age,  char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
    public static void main(String[] args) {
        Friend friend = new Friend("ww");
        Friend friend1 = new Friend("ww", 12);
        Friend friend2 = new Friend("ww", 12, 'w');

    }
}

