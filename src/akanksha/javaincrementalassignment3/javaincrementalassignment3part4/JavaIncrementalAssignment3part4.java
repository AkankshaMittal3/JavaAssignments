package akanksha.javaincrementalassignment3.javaincrementalassignment3part4;

/**
 * Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories
 * for each type of Cycle, and code that uses these factories.
 *
 * @author Akanksha Mittal
 */

interface Cycle {
    void test();
}

class Unicycle implements Cycle {

    @Override
    public void test() {
        System.out.println("Inside Unicycle::test() method.");
    }
}
class Bicycle implements Cycle {

    @Override
    public void test() {
        System.out.println("Inside Bicycle::test() method.");
    }
}
class Tricycle implements Cycle {

    @Override
    public void test() {
        System.out.println("Inside Tricycle::test() method.");
    }
}

class CycleFactory {

    //use getCycle method to get object of type Cycle
    public Cycle getCycle(Integer cycleType){
        if(cycleType == null){
            return null;
        }
        if(cycleType == 1){
            return new Unicycle();

        } else if(cycleType == 2){
            return new Bicycle();

        } else if(cycleType == 3){
            return new Tricycle();
        }

        return null;
    }
}

public class JavaIncrementalAssignment3part4 {

    public static void main(String[] args){
        CycleFactory cycleFactory = new CycleFactory();

        //get an object of UniCycle and call its test method.
        Cycle cycle1 = cycleFactory.getCycle(1);

        //call test method of Circle
        cycle1.test();

        //get an object of Bicycle and call its test method.
        Cycle cycle2 = cycleFactory.getCycle(2);

        //call test method of Bicycle
        cycle2.test();

        //get an object of Tricycle and call its test method.
        Cycle cycle3 = cycleFactory.getCycle(3);

        //call test method of Tricycle
        cycle3.test();

    }
}
