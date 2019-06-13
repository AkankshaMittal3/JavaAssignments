package akanksha.javaincrementalassignment6;


class Node<T> {
    T data;
    Node<T> next;//reference to next element

    Node(T d) {
        this.data = d;
        this.next = null;
    }

}

class SList<T> {
    Node head; //head of the list

    SList() {
        this.head = null;
    }

    SListIterator<T> iterator() {
        return new SListIterator<T>(this);
    }
}

class SListIterator<T> //iterator to navigate and do all opertions in the list
{
    SList list;
    Node curr;

    SListIterator(SList list) {
        this.list = list;
        curr = list.head;
    }

    public void insert(T x) {
        if (this.list.head == null) {
            this.list.head = new Node(x);
        } else {
            curr = this.list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(x);
        }
    }

    public void remove(T x) {
        curr = this.list.head;
        Node prev = null;
        while (curr.data != x && curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Not found");
        } else {
            prev.next = curr.next;
        }
    }

    public T next() {
        curr = curr.next;
        return (T) curr.data;
    }

    public boolean hasNext() {
        return this.next() != null;
    }

    public void print() //displays the entire list
    {
        curr = this.list.head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

public class JavaIncrementalAssignment6 {
    public static void main(String[] args) {
        SList<Integer> s = new SList<>();
        SListIterator itr = s.iterator();
        itr.insert(1);
        itr.insert(2);
        itr.insert(7);
        itr.insert(8);
        itr.insert(9);
        itr.insert(10);
        itr.remove(7);
        itr.print();
    }
}
