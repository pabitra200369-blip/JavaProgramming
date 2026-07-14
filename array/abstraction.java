abstract class animal1 {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class dog extends animal1 {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstraction {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.sleep();
    }
}
