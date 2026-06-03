//Create a user defined checked and unchecked exceptions.
package Assignment1;

class MyCheckedException extends Exception {
    public MyCheckedException(String msg) {
        super(msg);
    }
}

class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String msg) {
        super(msg);
    }
}

public class Q12_Exception {

    static void check(int n) throws MyCheckedException {

        if (n < 0) {
            throw new MyUncheckedException("Negative number not allowed");
        }

        if (n < 10) {
            throw new MyCheckedException("Value must be >= 10");
        }

        System.out.println("Valid number");
    }

    public static void main(String[] args) {

        try {
            check(6);
        } catch (MyCheckedException e) {
            System.out.println("Checked: " + e.getMessage());
        }

        try {
            check(-5);
        } catch (MyCheckedException e) {
            System.out.println("Checked: " + e.getMessage());
        } catch (MyUncheckedException e) {
            System.out.println("Unchecked: " + e.getMessage());
        }
    }
}