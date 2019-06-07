package akanksha.javaincrementalassignment3;

class Cycle
{
    public void balance()
    {
        System.out.println("Cycle balance");
    }
}
class Unicycle extends Cycle
{
    public void balance()
    {
        System.out.println("Unicycle balance");
    }
}
class Bicycle extends Cycle
{
    public void balance()
    {
        System.out.println("Bicycle balance");
    }

}
class Tricycle extends Cycle
{

}


public class JavaIncrementalAssignment3part2 {

    public static void main(String[] args)
    {
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

       
    }
}
