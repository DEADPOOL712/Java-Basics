
class Student {
    int rank;
    int age;
    String name;

    // public method can only access from object
    public void info() {
        System.out.println("The " + name + "is " + age + " year old. with rank of " + rank);
    }

    // static method can access directly from class
    static void classInfo() {
        System.out.println("This is class student ");
    }

    // constructor in java
    Student(String name) {
        this.name = name;
        System.out.println(" ==> The student constructor has been executed. <==");
    }

}

public class oopBasic {
    public static void main(String args[]) {

        // creating object from student class
        Student s1 = new Student("vaibhav");
        s1.rank = 1;
        s1.age = 20;
        s1.info();

        // accessing static class
        Student.classInfo(); // static method can be access directly without creating object

    }
}
