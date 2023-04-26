// enum is special class to group constants 
// enum can also use inside class 
public class index {

    enum LEVEL {
        LOW,
        HIGH,
        MEDIUM;

        public void info() {
            System.out.println("The method inside enum");
        }

    }

    public static void main(String args[]) {
        LEVEL myVariable = LEVEL.HIGH;
        System.out.println(myVariable);

        // this will return array LEVEL.values();
        for (LEVEL var : LEVEL.values()) {
            System.out.println(var);
        }

        System.out.println("H");
    }
}
