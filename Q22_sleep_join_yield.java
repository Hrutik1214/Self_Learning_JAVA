//Understand sleep , join , yield methods.
package Assignment1;

class WorkerThread extends Thread {

    public WorkerThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {

            System.out.println(getName() + " running: " + i);

            // yield
            if (i == 2) {
                Thread.yield();
            }

            // sleep
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q22_sleep_join_yield {
    public static void main(String[] args) throws Exception {

        WorkerThread t1 = new WorkerThread("Thread-1");
        WorkerThread t2 = new WorkerThread("Thread-2");

        t1.start();

        // join → wait for t1
        t1.join();

        t2.start();
    }
}