//Invoke private methods of some other class using reflection.
package Assignment1;

import java.lang.reflect.Method;

//Class with private method
class Demo {
 private void show() {
     System.out.println("Private method executed");
 }
}

public class Q26_Reflection {
 public static void main(String[] args) {

     try {
         Demo obj = new Demo();

         // get Class object
         Class<?> c = obj.getClass();

         // get private method
         Method m = c.getDeclaredMethod("show");

         // make it accessible
         m.setAccessible(true);

         // invoke method
         m.invoke(obj);

     } catch (Exception e) {
         System.out.println(e);
     }
 }
}
