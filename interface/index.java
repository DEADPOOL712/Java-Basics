// interface 
interface Animal {
    public void sound();

    public void info();
}

interface secondInterface {
    public void secondI();
}

class dog implements Animal, secondInterface {
    public void sound() {
        System.out.println("Dog sound !");
    }

    public void info() {
        System.out.println("Info about dog!");
    }

    public void secondI() {
        System.out.println("Hello this is second interface !");
    }
}

public class index {
    public static void main(String args[]) {
        System.out.println("Hello");
    }
}
