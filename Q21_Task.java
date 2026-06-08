package Assignment1;

//Same Task
class SameTask extends Thread {
 public void run() {
     System.out.println(Thread.currentThread().getName() + " doing same task");
 }
}

//Different Task 1
class Task1 extends Thread {
 public void run() {
     System.out.println("Task1: Printing numbers");
     for (int i = 1; i <= 3; i++) {
         System.out.print(i + " ");
     }
     System.out.println();
 }
}

//Different Task 2
class Task2 extends Thread {
 public void run() {
     System.out.println("Task2: Printing letters");
     for (char c = 'A'; c <= 'C'; c++) {
         System.out.print(c + " ");
     }
     System.out.println();
 }
}

public class Q21_Task {
 public static void main(String[] args) throws Exception {

     SameTask t1 = new SameTask();
     SameTask t2 = new SameTask();

     Task1 t3 = new Task1();
     Task2 t4 = new Task2();

     // Same task first
     t1.start();
     t1.join();

     t2.start();
     t2.join();

     // Then different tasks
     t3.start();
     t3.join();

     t4.start();
 }
}