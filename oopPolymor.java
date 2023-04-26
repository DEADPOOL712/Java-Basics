
import java.util.function.DoubleBinaryOperator;

// polymorphism is two type of 
// run time  -> function overloading 
// complie time -> functio overriding 

//! 1.function overloading 
// using same name method in same class

class Operation {
    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    public void sum(double x, double y) {
        System.out.println(x + y);
    }
}

// ! 2.function overriding
// using same name method in diff class

class Animal {
    public void sound() {
        System.out.println("The animal make sound");
    }
}

class dog extends Animal {
    public void sound() {
        System.out.println("The dog sound !");
    }
}

class cat extends Animal {
    public void sound() {
        System.out.println("The cat sound !");
    }
}

public class oopPolymor {
    public static void main(String args[]) {
        // ? ex overloading
        // Operation op = new Operation();
        // call diff method based on agr pass
        // op.sum(1, 33);
        // op.sum(13.55, 22.2);

        // ? ex overriding
        // dog dogObj = new dog();
        // cat catObj = new cat();
        // dogObj.sound();
        // catObj.sound();

        // ? college topic
        Animal an = new dog();
        an.sound();
        // dog d = new dog();
        // an = d;

        // an.sound();

    }
}
