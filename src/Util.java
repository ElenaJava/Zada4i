public class Util {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double r = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return  r;

    }

    public static void main(String[] args) {
        System.out.println(getDistance (3,4,5,6));

    }
}


