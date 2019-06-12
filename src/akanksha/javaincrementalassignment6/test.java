package akanksha.javaincrementalassignment6;

public class test {
    public static void main(String[] args)
    {
        SList head = new SList(5);
        head.add(6);
        head.add(7);
        head.add(8);
        head.print();
        head.remove(6);
        head.print();
    }
}
