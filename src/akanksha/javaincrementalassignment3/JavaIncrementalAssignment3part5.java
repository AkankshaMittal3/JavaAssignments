package akanksha.javaincrementalassignment3;
/**
 * Create a class with an inner class that has a non-default constructor (one that takes
 * arguments). Create a second class with an inner class that inherits from the first inner class.
 *
 * @author Akanksha Mittal
 */


//outer class
class A {
    A() {
        System.out.println("class A");
    }

    //inner class
    class B {
        B(int x) {
            System.out.println("Class B");
        }

    }
}

//second outer class inheriting class A
class C extends A {
    C() {
        super(); //A constructor
        D d = new D(4); //D constructor
        System.out.println("Class C");
    }

    //inner class inheriting another inner class
    class D extends A.B {

        D(int x) {
            super(x);//B constructor
            System.out.println("Class D");
        }
    }
}

public class JavaIncrementalAssignment3part5 {
    public static void main(String[] args) {

        C c = new C();
    }
}
