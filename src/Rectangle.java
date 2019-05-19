import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Rectangle {


    public static void main(String[] args)  throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String userIn = read.readLine();
        int length = userIn.length();
        for (int i = 0; i < length; i++){
            int x = Integer.parseInt(userIn.substring(i, (i + 1)));
            System.out.println(x);}

    }
}

