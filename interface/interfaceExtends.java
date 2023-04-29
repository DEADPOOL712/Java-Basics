
interface p {
    public int p = 10;

    public void method_p();
}

interface p1 extends p {
    public int p1 = 20;
}

interface p2 extends p {
    public int p3 = 30;
}

interface p12 extends p1, p2 {
    public void method_p12();
}

// creating class from interface p12
class Q implements p12 {
    public void method_p() {
        System.out.println("This method from interface p");
    }

    public void method_p12() {
        System.out.println("This method from interface p12");
    }
}

public class interfaceExtends {

    public static void main(String args[]) {

        // creating obj from class Q
        Q objQ = new Q();
        objQ.method_p();
        objQ.method_p12();
        System.out.println(objQ.p3);

    }
}
