
// JAVA Methods 

public class method {

    // ! normal function that return something
    static int calcAge(int year) {
        int age = 2023 - year;
        return age;
    }

    static void printInfo(int age, String name) {
        System.out.println("The " + name + " is " + age + " year old.");
    }

    // ! method overloading
    // method having same name with diff parameters
    static void addTwoNumber(int x, int y) {
        System.out.println("The sum of two number using M-overloading " + (x + y));
    }

    static void addTwoNumber(double x, double y) {
        System.out.println("The sum of two number using M-overloading " + (x + y));
    }

    public static void main(String args[]) {

        // ? =========== Method declare / return ================ //

        // calling calcAge normal use of function
        // int calculatedAge = calcAge(2003); // output 20 will store
        // printInfo(calcAge(2003), "vaibhav"); // passing function as argument

        // ? method oveloading
        // addTwoNumber(10, 20); // this call int method
        // addTwoNumber(10.33, 20.78); // this will call double method

        // ? scope rule are the same as js

        // ? recursion : fun calling it self
        System.out.println("Hello test");

    }
}