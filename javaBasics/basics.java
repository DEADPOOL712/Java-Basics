import javax.print.FlavorException;

public class basics {
    public static void main(String[] args) {

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
        // * widening casting samll -> big (automatic)
        // int a = 10;
        // double b = (int) a;

        // * narrowcasting big -> small (manually)
        // double a = 10.69d;
        // int b = (int) a;

        // ? ======== operators ======== //
        // * same as c++

        // ? ========= String / String Methods ========= //
        // * String creation using char array and norml method
        // char arr[] = { 'v', 'b', 'c' };
        // String charArrName = new String(arr);
        // String name = "Vaibahv";

        // * String operations
        String name = "Vaibhav ";
        String lName = " Saneapara ";
        int len = name.length();
        name.toLowerCase();
        name.toUpperCase();
        int index = name.indexOf("a");
        System.out.println(name.concat(lName));

        System.out.println(index);
        // System.out.println(a);
        // System.out.println(b);
    }
}