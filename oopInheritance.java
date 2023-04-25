// super class and subclass / inheritance 
class Fruit {
    String name;
    // rank can only access within the subclass or same package
    protected int rank;
}

final class cannotBeinherit {
    public void info() {
        System.out.println("This class cannot be inherite");
    }
}

class summerFruit extends Fruit {
    String type;

    public void info() {
        System.out.println("name : " + name);
        System.out.println("rank : " + rank);
        System.out.println("type : " + type);
    }
}

public class oopInheritance {
    public static void main(String args[]) {
        summerFruit SF1 = new summerFruit();
        SF1.name = "mango";
        SF1.type = "summer";
        SF1.rank = 2;
        SF1.info();

        // System.out.println(a == b);
    }
}
