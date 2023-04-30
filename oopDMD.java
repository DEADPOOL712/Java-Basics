// DMD 
// only use with runtime poly / method overridig 
// means method name should be same in child as parnet class

class Animal {
    public void sound() {
        System.out.println("Animal Method .");
    }
}

class dog extends Animal {
    public void sound() {
        System.out.println("Dog Method.");
    }
}

class cat extends Animal {
    public void sound() {
        System.out.println("Cat Method.");
    }
}

class oopDMD {
    public static void main(String args[]) {
        Animal an = new Animal();
        dog d = new dog();
        cat c = new cat();

        // using following we can use DMD
        an = d;
        an.sound();

        an = c;
        an.sound();

        // another way
        Animal an2 = new dog();
        an2.sound();
    }
}