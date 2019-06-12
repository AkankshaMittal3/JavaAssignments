package akanksha.javaincrementalassignment1;

public class Main {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.method1();
        obj.method2();

        Singleton s = Singleton.method("abc");
        s.print();
    }
}
