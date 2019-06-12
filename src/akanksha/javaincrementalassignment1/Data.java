package akanksha.javaincrementalassignment1;

public class Data {
    int var1;
    char var2;
    void method1() //prints member variables
    {
        System.out.println(var1 + " " + var2);
    }
    void method2()
    {
        int v1;
        char v2;
        // System.out.println(v1 + " " + v2); this will give error as local variables are not initialised
    }
}
