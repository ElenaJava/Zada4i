import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Calculator {
    public static void main(String[] args) throws IOException

    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();   //создание списка
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);   //добавление всех значений из одного списка в другой
        result.addAll(list2);

        for (Integer x : result)   //быстрый for по всем элементам, только для коллекций
        {
            System.out.println(x);
        }
    }}





//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<Integer> list = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//
//        for (int i = 0; i <5; i++) {
//            int a = scan.nextInt();
//           list.add(i, a);
//      }
//        Collections.reverse(list);
//        for (int i=0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//    }
//}







//public class Solution {
//    public static void main(String[] args) throws Exception {
//        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//
//        for (int i = 0; i <5; i++) {
//            int a = scan.nextInt();
//            list.add(i, a);
//       }
//for (int i=0; i<list.size(); i++){
//            if (list.get(i)%3==0) {list1.add(list.get(i));}
//             if (list.get(i)%2==0) {list2.add(list.get(i));}
//             if ((list.get(i)%2 !=0)&(list.get(i)%3 !=0) )    {list3.add(list.get(i));}
//
//}
//        printList (list);
//        printList (list1);
//        printList (list2);
//        printList (list3);
//
//    }
//
//    public static void printList(List<Integer> list) {
//        //list.forEach(System.out::println);
//
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//
//    }
//}}
//










//public class Solution {
//    public static int max;
//
//    public static void main(String[] args) throws IOException {
//
//        ArrayList<String> strings = new ArrayList<String>();
//        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 5; i++) {
//            String a = scan.readLine();
//            strings.add(i, a);
//        }
//        for (int i = 1; i <= 5; i++) {
//            if (strings.get(i).length() < strings.get(i - 1).length()) {
//                System.out.println(i);
//                break;
//            }
//
//
//        }
//    }
//}





//public class Solution {
//    public static void main(String[] args) throws Exception {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("мама");
//        list.add("мыла");
//        list.add("раму");
//       list.add(1,"именно");
//        list.add(3,"именно");
//        list.add(5,"именно");
//
//        for (int i=0;i<list.size();i++) {
//            System.out.println(list.get(i));
//       }
//    }
//}







//public class Solution {
//    public static void main(String[] args) throws Exception {
//        ArrayList<String> strings = new ArrayList<String>();
//        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
//       for (int i=0;i<5;i++){
//           String a = scan.readLine();
//          strings.add(i, a);
//       }
//        strings.remove(2);
//        Collections.reverse(strings);
//        for (int i=0;i<strings.size();i++) {
//            System.out.println(strings.get(i));
//        }
//
//
//    }
//}






//public class Solution {
//
//
//    public static void main(String[] args) throws Exception {
//
//        ArrayList<String> strings = new ArrayList<String>();
//
//        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
//        for (int i=0;i<4;i++){
//            String a = scan.readLine();
//            strings.add(i, a);
//        }
//        int minString = strings.get(0).length();
//        int index=0;
//        for (int i=0;i<strings.size();i++){
//            if(strings.get(i).length()<minString){
//                minString=strings.get(i).length();
//                index=i;
//
//            }
//        }
//        int maxString = strings.get(0).length();
//        int index2=0;
//        for (int i=0;i<strings.size();i++){
//            if(strings.get(i).length()>maxString){
//                maxString=strings.get(i).length();
//                index2=i;
//
//            }
//        }
//        if (index>index2){
//            System.out.println(strings.get(index2));
//        }
//else System.out.println(strings.get(index));
//
//
////        for (int i=0;i<strings.size();i++){
////                    if(strings.get(i).length()==strings.get(index).length()){
////                        System.out.println(strings.get(i));
////
////            }
////        }
//
//
//    }
//}







//public class Solution {
//    public static void main(String[] args) throws Exception {
//        ArrayList <String>list = new ArrayList<String>();
//        Scanner scan = new Scanner(System.in);
//        for (int i=0;i<5;i++) {
//            String a = scan.nextLine();
//            list.add(i, a);}
//for (int j=0; j<13;j++){
//    list.add(0, list.get(4));
//    list.remove(5);
//}
//        for (int i=0; i<list.size();i++){
//
//            System.out.println(list.get(i));
//        }
//
//
//    }}





//import java.util.ArrayList;
//
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        ArrayList<Stri//        }ng> list = new ArrayList<String>();
//        list.add(0,"q");
//        list.add(1,"qw");
//        list.add(2,"qwe");
//        list.add(3,"qwer");
//        list.add(4,"12345");
//        int n = list.size();
//        System.out.println(n);
//        for (int i=0; i<list.size();i++){
//
//            System.out.println(list.get(i));

//    }
//}









//import java.util.Scanner;
//
//
//public class Solution {
//
//    public static int even;
//    public static int odd;
//
//    public static void main(String[] args) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int numm = scan.nextInt();
//        while (numm > 0) {
//            if (numm % 2 == 0) {
//                even++;
//            } else odd++;
//            numm = numm / 10;
//        }
//        System.out.println("Even: "+even+ " Odd: "+odd);
//
//    }
//}










//
//            int count = (numm == 0) ? 1 : 0;
//        while (numm != 0) {
//            count++;
//            numm /= 10;
//        }
//        System.out.println(count);
//    int arr[] = new int[count];
//
//    for (int i=0;i<count;i++){
//        int arr[i]








//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.*;
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        int maximum=-2147483648;
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(reader.readLine());
//        if (N<=0) {
//            System.out.println("введите число больше нуля");
//        }
//        else
//        for (int i=0; i<N;i++) {
//                        int num = Integer.parseInt(reader.readLine());
//
//            if (num>maximum) maximum=num;
//        }
//
//
//        System.out.println(maximum);
//    }
//}
















/*
Совершенствуем функциональность
*/

//public class Solution {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        int d = Integer.parseInt(reader.readLine());
//        int q = Integer.parseInt(reader.readLine());
//        int minimum = min(a, b, c, d, q);
//
//        System.out.println("Minimum = " + minimum);
//    }
//
//
//    public static int min(int a, int b, int c, int d, int q) {
//     //   int[] array = new int[20];
//
//
//
//        if ((a <= b) & (a <= c) & (a <= d) & (a <= q)) return a;
//        else if ((b <= a) & (b <= c) & (b <= d) & (b <= q)) return b;
//        else if ((c <= a) & (c <= b) & (c <= d) & (c <= q)) return c;
//        else if ((d <= a) & (d <= b) & (d <= d) & (d <= q)) return d;
//        else return q;
//    }
//}
//
//












//        double summ = 0;
//        int count=0;
//        Scanner scan = new Scanner(System.in);
//        while (true) {
//
//            double a = scan.nextDouble();
//count++;
//            if (a != -1) {
//                summ = summ + a;
//            } else {
//                System.out.println(summ=summ/(count-1));
//
//                break;
//            }
//
//        }

//    }
//
//}


//   import java.io.*;
//   import java.util.Scanner;
//
//   public class Solution {
//        public static void main(String[] args) throws Exception {
//            Scanner scan = new Scanner(System.in);
//            int a = scan.nextInt();
//            int b = scan.nextInt();
//            int c = scan.nextInt();
//            int res = 0;
//            int res1 = 0;
//
//            int mod[] = {a, b, c};
//
//            for (int i = 0; i < mod.length; i++){
//            if (mod[i] > 0) {
//                res = res + 1;
//            }
//        }
//            for (int i = 0; i < mod.length; i++){
//                if (mod[i] < 0) {
//                    res1 = res1 + 1;
//                }
//            }
//            System.out.println("количество отрицательных чисел: " +res1);
//           System.out.println("количество положительных чисел: " + res);
//
//
//       }}





//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list = new ArrayList<>();
//
//        int n = Integer.parseInt(reader.readLine());
//        int m = Integer.parseInt(reader.readLine());
//
//        Scanner scan1 = new Scanner(System.in);
//        for (int i = 0; i < n; i++) {
//            list.add(reader.readLine());
//
//        }
//        for (int i = 0; i < m; i++) {
//            list.add(list.get(0));
//            list.remove(0);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }
//    }
//}
































    //    public static int plus(int a, int b) {
//        int c = a+b;
//        return c;
//    }
//
//    public static int minus(int a, int b) {
//        int d = a-b;
//        return d;
//    }
//
//    public static int multiply(int a, int b) {
//        int q = a*b;
//        return q;
//    }
//
//    public static double division(int a, int b) {
//        double qq = (a*1.0)/(b*1.0);
//        return qq;
//    }
//
//    public static double percent(int a, int b) {
//        double qqq = b*a/100.0;
//        return qqq;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(plus(3,6));
//        System.out.println(minus(3,6));
//        System.out.println(multiply(3,6));
//        System.out.println(division(3,6));
//        System.out.println(percent(3,6));
//    }
//}