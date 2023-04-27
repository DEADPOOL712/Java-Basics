class Website {
    String name;
    int traffic;
    String type;

    public void info() {
        System.out.printf("website:%s type:%s traffic:%d", name, type, traffic);

    }

    Website(String n, int t, String type) {
        this.name = n;
        this.traffic = t;
        this.type = type;

    }
}

class Myweb extends Website {
    String name = "lol"; // this keyword refer to instant of that class
    // while super keyword refer to the instant of sueprclass

    Myweb(String name, int traffic) {
        super(name, traffic, "e-commerce");
        System.out.println(this.name);
        System.out.println(super.name);
        super.info();
    }
}

public class oopSuper {
    public static void main(String args[]) {
        Myweb v1 = new Myweb("Oxyton", 200);
        v1.info();
        // System.out.println("Hello !");
    }
}
