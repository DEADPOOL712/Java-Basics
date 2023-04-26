import java.nio.channels.ShutdownChannelGroupException;

// modifier -> 4
// default -> whene nothing is specify the code is access only on same pakage
// public -> can access by any class 
// private -> only access within same class
// protected -> code is access within same pakage and subclass

class Student {
    int rank;
    int age;
    String name;
    static String gender;
    private int pass; // can only access within this class

    // public method can only access from object
    public void info() {
        System.out.println("The " + name + "is " + age + " year old " + gender + " with rank of " + rank);
    }

    // static method can access directly from class
    static void classInfo() {
        System.out.println("This is class student ");
    }

    // constructor in java
    Student(String name, int pass) {
        this.name = name;
        this.pass = pass;
        System.out.println(" ==> The student constructor has been executed. <==");
        System.out.println(pass);
    }

    public class inner {
        int x;
    }

}

// abstract and final keyword

// no class can inherite teacher class
final class teacher {
    String name;
    int age;

    public void info() {
        System.out.println("This is teacher class . ");
    }
}

// we cannot create object from School class
// we can only inherite from school class
abstract class School {
    public void info() {
        System.out.println("This is school class .");
    }
}

public class oopBasic {
    public static void main(String args[]) {

        // creating object from student class
        Student s1 = new Student("vaibhav", 124);
        s1.rank = 1;
        s1.age = 20;
        s1.info();

        // accessing static class
        Student.classInfo(); // static method can be access directly without creating object
        Student.gender = "male";
        s1.info();

        // abstract - try to access school class
        // School alpha = new School(); // this is not valid

        // final - can be use to create object
        // teacher thorfin = new teacher();

        // inner class
        // first create object of outerclass
        Student s2 = new Student("bravo", 31);
        // use following syntex to create obj from inner class
        Student.inner in1 = s2.new inner();
        in1.x = 8;

    }
}
