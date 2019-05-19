import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scan = new Scanner(System.in);
        String q = scan.nextLine();
        return  q;
    }

    public static int readInt() throws Exception {
        Scanner scan = new Scanner(System.in);
        int qq = scan.nextInt();
        return  qq;

    }

    public static double readDouble() throws Exception {
        Scanner scan = new Scanner(System.in);
        double qqq = scan.nextDouble();
        return  qqq;

    }

    public static boolean readBoolean() throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean qqqq = scan.nextBoolean();
        return  qqqq;

    }

    public static void main(String[] args) {

    }
}