//Implement wait , notify , notifyAll methods.
package Assignment1;

class Shared {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producer is waiting...");
        wait(); // release lock and wait

        System.out.println("Producer resumed");
    }

    synchronized void consume() {
        System.out.println("Consumer executing...");
        notifyAll(); // wake all waiting threads
    }
}

public class Q24_wait_notify_notifyAll {
    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            try {
                obj.produce();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            obj.consume();
        });

        t1.start();
        t2.start();
    }
}
