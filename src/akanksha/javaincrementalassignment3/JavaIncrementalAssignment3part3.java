package akanksha.javaincrementalassignment3;

/**
 * Create three interfaces, each with two methods. Inherit a new interface that combines the
 * three, adding a new method. Create a class by implementing the new interface and also
 * inheriting from a concrete class. Now write four methods, each of which takes one of the four
 * interfaces as an argument. In main( ), create an object of your class and pass it to each of the
 * methods.
 *
 * @author Akanksha Mittal
 */

interface i1 {
    void m1();

    void m2();
}

interface i2 {
    void m3();

    void m4();

}

interface i3 {
    void m5();

    void m6();
}

//interface extending three interfaces
interface i4 extends i1, i2, i3 {
    void m7();
}

class concrete {

}

class subClass extends concrete implements i4 {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    //methods with interface as argument
    public void method1(i1 i) {

    }

    public void method2(i2 i) {

    }

    public void method3(i3 i) {

    }

    public void method4(i4 i) {

    }
}

public class JavaIncrementalAssignment3part3 {
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.method1(obj);
        obj.method2(obj);
        obj.method3(obj);
        obj.method4(obj);
    }
}
