package akanksha.javaincrementalassignment1;

public class Singleton {
    String s1;
    public static Singleton method(String var)//returns object
    {
        Singleton obj = new Singleton();
        obj.s1 = "abc";
        return obj;
    }
    public void print()
    {
        System.out.println(this.s1);
    }
}
