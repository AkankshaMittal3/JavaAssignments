package akanksha.javaincrementalassignemnt2;

/**
 * Create a class with two (overloaded) constructors. Using this, call the second constructor
 * inside the first one.
 *
 * @author Akanksha Mittal
 */


class A {
    A() {
        this(4);
    }

    A(int x) {
        System.out.println(x);
    }
}

public class JavaIncrementalAssignment2Part2 {
    public static void main(String[] args) {
        A a = new A();
    }
}
