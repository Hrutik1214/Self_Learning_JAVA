package Assignment1;

//Using Thread class
class MyThread extends Thread {
 public void run() {
     System.out.println("Thread class running");
 }
}

//Using Runnable
class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Runnable thread running");
 }
}

public class Q20_multiple_threads {
 public static void main(String[] args) {

     // Thread class
     MyThread t1 = new MyThread();
     MyThread t2 = new MyThread();

     // Runnable
     Thread t3 = new Thread(new MyRunnable());
     Thread t4 = new Thread(new MyRunnable());

     t1.start();
     t2.start();
     t3.start();
     t4.start();
 }
}
