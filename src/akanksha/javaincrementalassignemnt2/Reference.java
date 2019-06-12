package akanksha.javaincrementalassignemnt2;


public class Reference {
    Reference(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Reference[] r = new Reference[1];
        r[0] = new Reference("abc");
    }
}