import java.util.Scanner;
import java.util.Arrays;

public class basics {
    public static void main(String[] args) {

        // test
        int arr[] = new int[10];
        String name[] = new String[10];

        // ? ============ datatypes and variables ================= //
        // * int, double, char, boolean, String
        // int a = 10;
        // double b = 10.5;
        // char c = 'A';
        // boolean d = true;
        // String e = "Hello World";
        // float f = 10.5f;
        // * same varibale rule as in c++
        // 1. no keyword
        // 2. no special character except $ and _
        // 3. cannot start with a number
        // 4. cannot use a pre-defined name
        // 5. case sensitive

        // ? ============ type casting ================= //
        // * widening casting samll -> big (automat ic)
        // int a = 10;
        // double b = (int) a;

        // * narrowcasting big -> small (manually)
        // double a = 10.69d;
        // int b = (int) a;

        // ? ======== operators ======== //
        // * same as c++

        // ? ========= String Creation / String Methods ========= //
        // * String creation using char array and norml method

        // char arr[] = { 'v', 'b', 'c' };
        // String charArrName = new String(arr);
        // String nameObj = new String("hellow !");
        // String name = "Vaibahv";

        // ! IMP TOPIC FOR STRING

        // String s1 = new String("abc");
        // String s2 = new String("abc");
        // String s3 = "xyz";
        // String s4 = "xyz";
        // == sign compare two obj and new create two diff obj
        // System.out.println(s3 == s4); // => true
        // System.out.println(s1 == s2); // => false
        // System.out.println(s1.equals(s2)); => true

        // String n1 = "sample2ss2";
        // String n2 = "sample1";
        // System.out.println(n1.compareTo(n2)); // return 0,postive,negative

        // * String operations

        // String name = "Vaibhav ";
        // String lName = " Saneapara ";

        // int len = name.length();

        // String formatedString = String.format("Hello my name is %s %s", name, lName);

        // name.toLowerCase();
        // name.toUpperCase();

        // System.out.println(name.concat(lName));

        // int index = name.indexOf("a");
        // System.out.println(index);

        // String completeSen = "The roses are red and the color is red";
        // System.out.println(completeSen.replace("red", "blue"));
        // System.out.println(completeSen.contains("red")); => check if contains

        // String fullStrign = "This is eart 661";
        // System.out.println(fullStrign.substring(0, 2)); // index 2 is excluded

        // * other method str.
        // charAt(indexValue),indexOf('a'),lastIndexOf('a'),startWith("Hello"),trim()

        // * converting any value to string
        // 1. using +
        // 2. using toString Method
        // 3. using valueOf Method
        // double dnum = 10.64;
        // System.out.println(dnum + "");
        // System.out.println(Double.toString(dnum));
        // System.out.println(String.valueOf(dnum));

        // ! convertin string into bytes array
        // String message = "Hello vaibhav";
        // int messageLen = message.length();
        // byte byteMessage[] = message.getBytes();
        // for (byte i : byteMessage) {
        // System.out.println(i);
        // }

        // ! convertin string into char array
        // char charMessage[] = new char[messageLen];
        // message.getChars(0, messageLen, charMessage, 0); //
        // startIndex,endIndex,destination,desEnd
        // for (char c : charMessage) {
        // System.out.println(c);
        // }

        // ? ========= Taking user input / Scanner Class ========= //

        // * create new scanner obj and use to take input

        // Scanner sc = new Scanner(System.in);

        // String userName = sc.nextLine();
        // System.out.println(userName);

        // int age = Integer.valueOf(sc.nextLine()); // => converting string to number
        // int age = sc.nextInt();

        // it will free the resources
        // sc.close();

        // ? ========= Math function ========== //
        // Math.max(5, 6);
        // Math.min(5, 6);
        // Math.sqrt(10);
        // Math.random(); // => 0 to 0.99
        // Math.abs(-30);

        // ? ========= Boolean datatype ========== //
        // boolean x = true;
        // System.out.println(x);

        // ? ========== conditional programs ================ //
        // * if elss,for loop , while loop,do while loop,switch statement etc are same
        // * alose break and continue are same as cpp
        // ! some new concepts,forEach
        // forEach loop use to traverse through array
        // int numbers[] = { 1, 2, 3, 4, 5 };
        // for (int num : numbers) {
        // System.out.println(num);
        // }

        // ? ================== Array / Methods ================ //
        // * array declaration

        // int arr[] = new int[5]; // => initialization of array
        // String []animals = {"cow","cat"};
        // String animals[] = {"cwo","cat"};

        // * array Operations
        // String cars[] = { "bmw", "Ford", "volvo" };

        // length for array and length() for string
        // System.out.println(cars.length);

        // loop through array using for and forEach loop
        // for (String car : cars) {
        // System.out.println(car);
        // }

        // * Multi-Dimensinoal Array
        // int matrixOfNumber[][] = { { 1, 2 }, { 3, 4 }, { 4, 5 } };
        // System.out.println(matrixOfNumber[1][1]); // => 4

        // * Sorting and searching in array
        int numbers[] = { 7, 1, 3, 9, 11, 2, 55 };

        // below method will mutate original array
        // Arrays.sort(numbers);

        // int sortedNumber[] = { 1, 2, 3, 4, 5, 6 };
        // int index = Arrays.binarySearch(sortedNumber, 5);
        // System.out.println(index);

        // for (int num : numbers) {
        // System.out.println(num);
        // }

        // ! copy Array using System.arraycopy(target,index,copyArr,index,length)
        // int num[] = { 1, 2, 3, 4, 5 };
        // int copyNum[] = new int[num.length];
        // System.arraycopy(num, 0, copyNum, 0, num.length);
        // for (int i : copyNum) {
        // System.out.println(i);
        // }

        Scanner s = new Scanner(System.in);

    }
}