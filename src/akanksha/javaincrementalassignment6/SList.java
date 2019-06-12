package akanksha.javaincrementalassignment6;

public class SList<T> {
    T data;
    SList next;

    SList(T d) {
        this.data = d;
        this.next = null;
    }

    public void print() {
        SList l = this;
        while (l != null) {
            System.out.println(l.data);
            l = l.next;
        }
    }

    public void add(T d) {
        SList obj = new SList(d);
        SList l = this;
        while (l.next != null) {
            l = l.next;
        }
        l.next = obj;
    }

    public void remove(T d) {
        SList l = this;
        SList prev = null;
        while (l.data != d && l.next != null) {
            prev = l;
            l = l.next;
        }
        if (l == null) {
            System.out.println("Not found");
        } else {
            prev.next = l.next;
        }
    }
}
