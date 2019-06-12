package akanksha.javaincrementalassignment4;

/**
 * Create three new types of exceptions. Write a class with a method that throws all three. In main(
 * ), call the method but only use a single catch clause that will catch all three types of exceptions.
 * Add a finally clause and verify that your finally clause is executed, even if a NullPointerException
 * is thrown.
 *
 * @author Akanksha Mittal
 */

class Exception1 extends Exception {
    Exception1(String err) {
        super(err);
    }
}

class Exception2 extends Exception {
    Exception2(String err) {
        super(err);
    }

}

class Exception3 extends Exception {
    Exception3(String err) {
        super(err);
    }
}

public class Exceptions {
    static void test(int num) {
        try {
            if (num == 1) {
                throw new Exception1("1st Exception");
            } else if (num == 2) {
                throw new Exception2("2nd Exception");
            } else if (num == 3) {
                throw new Exception3("3rd Exception");
            } else {
                throw new NullPointerException("NullPointerException");
            }
        } catch (Exception e) {
            System.out.println("Exception Caught " + e.getMessage());
        } finally {
            System.out.println("finally block executed.");
        }
    }

    public static void main(String[] args) {
        test(1);
        test(2);
        test(3);
        test(5);
    }
}

