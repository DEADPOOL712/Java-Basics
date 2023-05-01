// abstract keyword use in method and class to hide data 
// abstract class can not be use to create obj its only iher.
abstract class DemoAbstract {
    // normal and abstract method use
    public abstract void animalSound();

    public void normalMethod() {
        System.out.println("This is normla method ");
    }

}

class Animal extends DemoAbstract {
    public void animalSound() {
        System.out.println("This is animal sound method ");
    }

}

public class oopAbstraction {
    public static void main(String args[]) {
        Animal a1 = new Animal();
        a1.animalSound();
        System.out.println("Hello ");
    }
}
