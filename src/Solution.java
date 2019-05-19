import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        method1();
//    }
//
//    public static StackTraceElement[] method1() {
//        method2();
//        //напишите тут ваш код
//    }
//
//    public static StackTraceElement[] method2() {
//        method3();
//        //напишите тут ваш код
//    }
//
//    public static StackTraceElement[] method3() {
//        method4();
//        //напишите тут ваш код
//    }
//
//    public static StackTraceElement[] method4() {
//        method5();
//        //напишите тут ваш код
//    }
//
//    public static StackTraceElement[] method5() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements)
//        {
//            System.out.println(element.getMethodName());
//        }
//    }
//}








//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        // List of addresses
//        HashMap<String,String> map = new HashMap<String,String>();
//        while (true) {
//            String city = reader.readLine();
//
//            if (city.isEmpty()) break;
//            String family = reader.readLine();
//            map.put(city,family);
//        }
//        String fimilia2 = reader.readLine();
//                System.out.println(map.get(fimilia2));
//        }
//        }





//public class Solution {
//    public static HashMap<String, String> createMap() {
//        HashMap<String,String> map = new HashMap<String, String>();
//    map.put("коробкова","анна000");
//        map.put("коробкова1","анна000");
//        map.put("коробкова3","анна0001");
//        map.put("коробкова09","анна00011");
//        map.put("коробкова4","анна001");
//        map.put("коробкова9","анна00");
//        map.put("коробкова8","анна");
//        map.put("коробкова7","анна");
//        map.put("коробкова6","анна");
//        map.put("коробкова5","анна");
//   return map;
//    }
//
//    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
//        int count=0;
//        for(String v : map.values()) {
//            if (name.equals(v)) {
//            count++;
//        }}
//   return count;
//    }
//
//    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
//        int count2=0;
//for(String k : map.keySet()) {
//    if (lastName.equals(k)) {
//        count2++;
//    }
//}
//        return count2;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getCountTheSameLastName(createMap(),"коробкова5"));
//        System.out.println(getCountTheSameFirstName(createMap(),"анна"));
//    }
//}




//public class Solution {
//    public static HashMap<String, Integer> createMap() {
//        HashMap<String,Integer> map = new HashMap<String,Integer>();
//        map.put("A",100);
//        map.put("b",1000);
//        map.put("Ac",200);
//        map.put("As",300);
//        map.put("Ad",400);
//        map.put("Af",500);
//        map.put("Ag",600);
//        map.put("Agggg",700);
//        map.put("Ahh",800);
//        map.put("Ah",8800);
//
//        return map;
//    }
//
//    public static void removeItemFromMap(HashMap<String, Integer> map) {
//        Set<Map.Entry<String, Integer>> set = map.entrySet();
//        set.removeIf(value -> value.getValue() < 500);
//    }
//
//    public static void main(String[] args) {
//    }
//}


//public class Solution {
//    public static Set<String> createSet() {
//        HashSet<String> set = new HashSet<>();
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//        set.add("Лл");
//
//
//    return set;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}



//public class Solution {
//    public static HashSet<Integer> createSet() {
//        HashSet<Integer> set = new HashSet<Integer>();
////        int a=2;
////        for(int i=0; i<20; i++){
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.add(6);
//        set.add(7);
//        set.add(8);
//        set.add(9);
//        set.add(10);
//        set.add(19);
//        set.add(91);
//        set.add(18);
//        set.add(17);
//        set.add(16);
//        set.add(15);
//        set.add(14);
//        set.add(32);
//        set.add(12);
//        set.add(11);
//
////        }
//        return set;
//    }
//
//    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
//
//        Iterator<Integer> iterator = set.iterator();
//
//        while (iterator.hasNext()) {
//            int item = iterator.next();
//            if (item > 10) {
//                iterator.remove();
//            }
//
//
//               }
//        return set; }
//
//
//    public static void main(String[] args) {
//        //System.out.println(removeAllNumbersGreaterThan10(createSet()));
//    }
//}









//
///*
//Модернизация ПО
//*/
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] array = new String[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = reader.readLine();
//        }
//
//        sort(array);
//
//        for (String x : array) {
//            System.out.println(x);
//        }
//    }
//
//    public static void sort(String[] array) {
//        //напишите тут ваш код
//    }
//
//    //Метод для сравнения строк: 'а' больше чем 'b'
//    public static boolean isGreaterThan(String a, String b) {
//        return a.compareTo(b) > 0;
//    }
//}


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        map.put(1,"January");
//        map.put(2,"February");
//        map.put(3,"March");
//        map.put(4,"April");
//        map.put(5,"May");
//        map.put(6,"June");
//        map.put(7,"July");
//        map.put(8,"August");
//        map.put(9,"September");
//        map.put(10,"October");
//        map.put(11,"November");
//        map.put(12,"December");
//
//
//       Scanner scan  = new Scanner(System.in);
//       String a = scan.nextLine();
//       if (a.equals("January")){
//           System.out.println("January is the 1 month");}
//           if (a.equals("February")){
//               System.out.println("February is the 2 month");}
//               if (a.equals("March")){
//                   System.out.println("March is the 3 month");}
//        if (a.equals("April")){
//            System.out.println("April is the 4 month");}
//        if (a.equals("May")){
//            System.out.println("May is the 5 month");}
//        if (a.equals("June")){
//            System.out.println("June is the 6 month");}
//        if (a.equals("July")){
//            System.out.println("July is the 7 month");}
//        if (a.equals("August")){
//            System.out.println("August is the 8 month");}
//        if (a.equals("September")){
//            System.out.println("September is the 9 month");}
//        if (a.equals("October")){
//            System.out.println("October is the 10 month");}
//        if (a.equals("November")){
//            System.out.println("November is the 11 month");}
//        if (a.equals("December")){
//            System.out.println("December is the 12 month");}
//    }
//    }





//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//        }
//
//        sort(array);
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//    }
//
//    public static void sort(int[] array) {
//        for(int i = array.length-1 ; i > 0 ; i--){
//            for(int j = 0 ; j < i ; j++){
//               if( array[j] > array[j+1] ){
//                int tmp = array[j];
//                   array[j] = array[j+1];
//                   array[j+1] = tmp;
//            }
//        }
//
//}
//    }
//}



//public class Solution {
//    public static void main(String[] args) throws Exception {
//        List<Integer> integerList = getIntegerList();
//        System.out.println(getMinimum(integerList));
//    }
//
//    public static int getMinimum(List<Integer> array) {
//        int a=2147483647;
//for (int i=0;i<array.size(); i++){
//    if (array.get(i)<a){
//        a=array.get(i);
//    }
//}
//        return a;
//    }
//
//    public static List<Integer> getIntegerList() throws IOException {
//        ArrayList<Integer> q = new ArrayList<Integer>();
//       Scanner scan = new Scanner(System.in);
//        Scanner scan1 = new Scanner(System.in);
//      int w=scan1.nextInt();
//
//       for (int i=0; i<w; i++){
//           q.add(scan.nextInt());
//      }
//        return q;
//    }
//}
//





//public class Solution {
//    public static void main(String[] args) {
//        Map<String, String> map = createPeopleList();
//        printPeopleList(map);
//    }
//
//    public static Map<String, String> createPeopleList() {
//        Map<String,String> map = new HashMap<String,String>();
//
//        map.put("q","w");
//        map.put("qq","ww");
//        map.put("qqq","www");
//        map.put("qqqq","ww");
//        map.put("qq","wwwww");
//        map.put("aa","ss");
//        map.put("a","s");
//        map.put("aaa","sss");
//        map.put("aaaa","ssss");
//        map.put("x","z");
//        return map;
//    }
//
//    public static void printPeopleList(Map<String, String> map) {
//        for (Map.Entry<String, String> s : map.entrySet()) {
//            System.out.println(s.getKey() + " " + s.getValue());
//        }
//    }
//}



//public class Solution {
//    public static void main(String[] args) throws IOException {
//        ArrayList<Integer> q = new ArrayList<Integer>();
//        Scanner scan = new Scanner(System.in);
//       for (int i=0; i<10; i++){
//           q.add(scan.nextInt());
//       }
//
//      // Collections.sort(q);
//int count=1;
//int midle=1;
//       for (int i=0;i<10;i++){
//    if (q.get(i).equals(q.get(i+1))){
//        count++;
//        if(count>midle){
//            midle=count;
//        }
//    }
//else count = 1;
//
//       }
//        System.out.println(midle);
//    }
//}


//public class Solution {
//    public static void main(String[] args) throws Exception {
//        // ArrayList
//        ArrayList arrayList = new ArrayList();
//        insert10000(arrayList);
//        get10000(arrayList);
//        set10000(arrayList);
//        remove10000(arrayList);
//
//        // LinkedList
//        LinkedList linkedList = new LinkedList();
//        insert10000(linkedList);
//        get10000(linkedList);
//        set10000(linkedList);
//        remove10000(linkedList);
//    }
//
//    public static void insert10000(List list) {
//        for (int i=0; i<10000; i++) {
//            list.add(0, i);
//        }
//    }
//
//    public static void get10000(List list) {
//        for (int i=0; i<10000; i++){
//            list.get(i);
//        }
//
//    }
//
//    public static void set10000(List list) {
//        for (int i=0; i<10000; i++) {
//            list.set(0,i);
//        }
//
//
//    }
//
//    public static void remove10000(List list) {
//        for (int i=0; i<10000; i++) {
//            list.remove(0);
//        }
//
//    }
//}


//public class Solution {
//    public static List getListForGet() {
//        ArrayList<String> q = new ArrayList<>();
//        return q;
//
//    }
//
//    public static List getListForSet() {
//        ArrayList<String> qq = new ArrayList<>();
//        return qq;
//
//    }
//
//    public static List getListForAddOrInsert() {
//        LinkedList<String> qqq = new LinkedList<>();
//        return qqq;
//    }
//
//    public static List getListForRemove() {
//
//            LinkedList<String> qqqq = new LinkedList<>();
//            return qqqq;
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


//public class Solution {
//    public static void main(String[] args) {
//        System.out.println(getGetTimeInMs(fill(new ArrayList())));
//        System.out.println(getGetTimeInMs(fill(new LinkedList())));
//    }
//
//    public static List fill(List list) {
//        for (int i = 0; i < 10000; i++) {
//            list.add(new Object());
//        }
//        return list;
//    }
//
//    public static long getGetTimeInMs(List list) {
//        Date a = new Date();
//
//
//        get10000(list);
//
//        Date b = new Date();
//        long c = b.getTime() - a.getTime();
//        return  c;
//
//    }
//
//    public static void get10000(List list) {
//        if (list.isEmpty()) return;
//        int x = list.size() / 2;
//        for (int i = 0; i < 10000; i++) {
//            list.get(x);
//        }
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        System.out.println(getInsertTimeInMs(new ArrayList()));
//        System.out.println(getInsertTimeInMs(new LinkedList()));
//    }
//
//    public static long getInsertTimeInMs(List list) {
//        Date a = new Date();
//
//        insert10000(list);
//Date b = new Date();
//long c = b.getTime()-a.getTime();
//        return c;
//
//    }
//
//    public static void insert10000(List list) {
//        for (int i = 0; i < 10000; i++) {
//            list.add(0, new Object());
//        }
//    }
//}




//public class Solution {
//    public static void main(String[] args) throws Exception {
//        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
//
//        HashMap<String, Cat> map = addCatsToMap(cats);
//
//        for (Map.Entry<String, Cat> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//    }
//
//
//    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
//        HashMap<String, Cat> catt = new HashMap<String, Cat>();
//for(int i=0;i<cats.length;i++){
//    catt.put(cats[i],new Cat(cats[i]));
//
//}
//return catt;
//
//
//    }
//
//
//    public static class Cat {
//        String name;
//
//        public Cat(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return name != null ? name.toUpperCase() : null;
//        }
//    }
//}






//public class Solution {
//    public static void main(String[] args) throws Exception {
//        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("Sim", 5);
//        map.put("Tom", 5.5);
//        map.put("Arbus", false);
//        map.put("Baby", null);
//        map.put("Cat", "Cat");
//        map.put("Eat", new Long(56));
//        map.put("Food", new Character('3'));
//        map.put("Gevey", '6');
//        map.put("Hugs", 111111111111L);
//        map.put("Comp", (double) 123);
//
//        for (Map.Entry<String, Object> pair : map.entrySet()) {
//            String key = pair.getKey();
//            Object value = pair.getValue();
//            System.out.println(key + " - " + value);
//       }
//
//    }
//}





//public class Solution {
//    public static void main(String[] args) throws Exception {
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("Sim", "Sim");
//        map.put("Tom", "Tom");
//        map.put("Arbus", "Arbus");
//        map.put("Baby", "Baby");
//        map.put("Cat", "Cat");
//        map.put("Dog", "Dog");
//        map.put("Eat", "Eat");
//        map.put("Food", "Food");
//        map.put("Gevey", "Gevey");
//        map.put("Hugs", "Hugs");
//
//        printKeys(map);
//    }
//
//    public static void printKeys(Map<String, String> map) {
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            String key = pair.getKey();
//            System.out.println(key);
//        }
//    }





//public class Solution {
//    public static void main(String[] args) throws Exception {
//
//HashMap<String, String> map = new HashMap<String, String>();
//map.put("арбуз","ягода");
//map.put("банан","трава");
//map.put("вишня","ягода");
//map.put("груша","фрукт");
//map.put("дыня","овощ");
//map.put("ежевика","куст");
//map.put("жень-шень","корень");
//map.put("земляника","ягода");
//map.put("ирис","цветок");
//map.put("картофель","клубень");
//
//for(Map.Entry<String,String> pair : map.entrySet()){
//    String key = pair.getKey();
//    String value = pair.getValue();
//    System.out.println(key + " - " + value);
//}
//
//    }
//}






//public class Solution {
//    public static void main(String[] args) throws Exception {
//        HashSet<String> set = new HashSet<String>();
//        set.add("арбуз");
//        set.add("банан");
//        set.add("вишня");
//        set.add("груша");
//        set.add("дыня");
//        set.add("ежевика");
//        set.add("женьшень");
//        set.add("земляника");
//        set.add("ирис");
//        set.add("картофель");
//        for (String text: set){
//            System.out.println(text);
//        }
//
//
//            }
//}


//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] array = new int[20];
//        for (int i = 0; i < 20; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//        }
//
//        sort(array);
//
//        for (int x : array) {
//            System.out.println(x);
//        }
//    }
//
//    public static void sort(int[] array) {
//        Arrays.sort(array);
//        for(int i=0;i<20;i++){
//            array.add(0, array[i]);
//        }
//        for(int i=0;i<20;i++){
//            array[i]=array.get(i);
//        }
//
//    }
//}


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<String> list = new ArrayList<String>();
//        while (true) {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            list.add(s);
//        }
//
//        ArrayList<String> listUpperCase = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++) {
//
//            if (list.get(i).length()%2==0) System.out.println(list.get(i) + " " + list.get(i));
//            else if (list.get(i).length()%2==1) System.out.println(list.get(i) + " "+list.get(i)+ " "+list.get(i));
//
//            }
//        }
//
//        }







//public class Solution {
//    public  static ArrayList<Cat> CATS = new ArrayList<>();
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        while (true) {
//           String name = reader.readLine();
//            if (name.isEmpty()) break;
//            String age = reader.readLine();
//            if (age==null)
//                break;
//            String weight = reader.readLine();
//            if (weight==null)
//                break;
//            String tailLength = reader.readLine();
//            if (tailLength==null)
//                break;
//            Cat cat = new Cat(name, Integer.parseInt(age), Integer.parseInt(weight), Integer.parseInt(tailLength));
//            CATS.add(cat);
//
//
//
//        }
//        printList();
//    }
//
//    public static void printList() {
//        for (int i = 0; i < CATS.size(); i++) {
//            System.out.println(CATS.get(i));
//        }
//    }
//
//    public static class Cat {
//        private String name;
//        private int age;
//        private int weight;
//        private int tailLength;
//
//          Cat(String name, int age, int weight, int tailLength) {
//            this.name = name;
//            this.age = age;
//            this.weight = weight;
//            this.tailLength = tailLength;
//        }
//
//        @Override
//        public String toString() {
//            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
//        }
//    }
//}





//public class Solution {
//    public static void main(String[] args) {
//        Human q = new Human("qq", true, 15);
//        Human qq = new Human("ww", false, 16);
//        Human qqq = new Human("eeee", false, 17);
//        Human qqqq = new Human("rrrrrr", true, 18);
//        Human a = new Human("rrrrrr", true, 9, qq, q);
//        Human aaa = new Human("ttt", true, 20, qq, q);
//        Human aa = new Human("ttttt", false, 21, qq, q);
//        Human aaaa = new Human("yyy", true, 22, qq, q);
//        Human aaaaa = new Human("yyy", false, 12, qq, q);
//ArrayList<Human>list = new ArrayList<>();
//    list.add(q);
//        list.add(qq);
//        list.add(qqq);
//        list.add(qqqq);
//        list.add(a);
//        list.add(aa);
//        list.add(aaa);
//        list.add(aaaa);
//        list.add(aaaaa);
//
//        for (int i =0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//    }
//
//    public static class Human {
//        String name;
//        boolean sex;
//        int age;
//Human mother;
//Human father;
//
//public Human (String name, boolean sex, int age){
//   this.name=name;
//   this.sex=sex;
//   this.age = age;
//   }
//   public Human (String name, boolean sex, int age, Human mather, Human father) {
//            this.name=name;
//            this.sex=sex;
//            this.age = age;
//        this.mother=mother;
//       this.father=father;
//            }
//
//
//
//        public String toString() {
//            String text = "";
//            text += "Имя: " + this.name;
//            text += ", пол: " + (this.sex ? "мужской" : "женский");
//            text += ", возраст: " + this.age;
//
//            if (this.father != null)
//                text += ", отец: " + this.father.name;
//
//            if (this.mother != null)
//                text += ", мать: " + this.mother.name;
//
//            return text;
//        }
//    }
//}


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//ArrayList<String> list = new ArrayList<String>();
//       for (int i =0 ;;i++) {
//           String a = reader.readLine();
//            list.add(i, a);
//        if (list.get(i).equals("end")) {
//            list.remove(i);
//            break;}
//
//       }
//        System.out.println(list);
//
//
//
//
//    }
//}






//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list1 = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            String a = reader.readLine();
//            list1.add(i, a);
//        }
//
//
//        ArrayList<String> result = doubleValues(list1);
//
//        for (int i=0; i< list1.size(); i++){
//            System.out.println(result.get(i));
//        }
//    }
//
//    public static ArrayList<String> doubleValues(ArrayList<String> list) {
//        for (int i=0; i< list.size();i++){
//            String x = list.get(i);
//            list.add(i, x);
//            i++;
//        }
//        return list;
//    }
//}





//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        int maximum=0;
//        int minimum=2147483647;
//
//       int [] mass = new int[5];
//       for (int i=0;i<5;i++){
//           mass[i]=Integer.parseInt(reader.readLine());
//       }
//
//       for (int i = 0; i<5; i++){
//           if (mass[i]>maximum){
//               maximum=mass[i];
//           }
//       }
//        for (int i = 0; i<5; i++){
//            if (mass[i]<minimum){
//                minimum=mass[i];
//            }
//        }
//
//
//
//
//        System.out.print(maximum + " " + minimum);
//    }
//}












//
//
//public class Solution {
//    public final static int A = 5;
//    public final static int B = 2;
//    public final static int C = A * B;
//
//    public static void main(String[] args) {
//    }
//
//    public  int getValue() {
//        return C;
//    }
//}
//





//public class Solution {
//    public static void main(String[] args) throws InterruptedException{
//        for (int i = 30; i >= 0; i--) {
//            System.out.println(i);
//            Thread.sleep (1000);
//            //напишите тут ваш код
//        }
//
//        System.out.println("Бум!");
//    }
//}




