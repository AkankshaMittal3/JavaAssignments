package akanksha.javaincrementalassignment3;

/**
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method
 * to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast them
 * to an array of Cycle. Try to call balance( ) on each element of the array and observe the results.
 * Downcast and call balance( ) and observe what happens.
 *
 * @author Akanksha Mittal
 */

class Cycle {
    public void balance() {
        System.out.println("Cycle balance");
    }
}

class Unicycle extends Cycle {
    public void balance() {
        System.out.println("Unicycle balance");
    }
}

class Bicycle extends Cycle {
    public void balance() {
        System.out.println("Bicycle balance");
    }

}

class Tricycle extends Cycle {

}


public class JavaIncrementalAssignment3part2 {

    public static void main(String[] args) {
        Cycle[] cycle = new Cycle[3];

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        //upcasting
        cycle[0] = unicycle;
        cycle[1] = bicycle;
        cycle[2] = tricycle;

        //call balance method

        //will override super class method
        cycle[0].balance();
        cycle[1].balance();

        cycle[2].balance();//super class method called

        //downcasting
        unicycle = (Unicycle) cycle[0];
        bicycle = (Bicycle) cycle[1];
        tricycle = (Tricycle) cycle[2];

        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }
}
