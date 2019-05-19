public class Triangle {
    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;

    }

    public static void main(String[] args) {
        Triangle c = new Triangle();
        c.setTime("1234");
        String todd = c.getTime();
        System.out.println(todd);
    }
}