package akanksha.javaincrementalassignment3;

abstract class Rodents {

    public Rodents() {
        System.out.println("Rodents class");
    }

    public void test() {
        System.out.println("Rodents method");
    }

    abstract void eat();

    abstract void run();
}

class Gerbil extends Rodents {
    public Gerbil() {
        System.out.println("Gerbil class");
    }

    public void test() {
        System.out.println("Gerbil method");
    }

    @Override
    void eat() {
        System.out.println("Gerbil is eating");
    }

    @Override
    void run() {
        System.out.println("Gerbil is running");
    }

}

class Hamster extends Rodents {

    public Hamster() {
        System.out.println("Hamster class");
    }

    public void test() {
        System.out.println("Hamster method");
    }


    @Override
    void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    void run() {
        System.out.println("Hamster is running");
    }

}


public class JavaIncrementalAssignment3 {

    public static void main(String[] args) {
        Rodents[] rodents = new Rodents[3];
        rodents[0] = new Gerbil();
        rodents[1] = new Hamster();

        rodents[0].eat();
        rodents[0].run();
        rodents[0].test();

        rodents[1].eat();
        rodents[1].run();
        rodents[1].test();
    }
}
