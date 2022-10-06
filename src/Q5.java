 interface MyInterface1 {
     default void display() {
         System.out.println("MyInterface1");
     }
 }
 interface MyInterface2 {
     default void display() {
         System.out.println("MyInterface2");
     }
 }
 interface MyInterface3 extends MyInterface1,MyInterface2 {
     default void display() {
         System.out.println("MyInterface3");
     }
 }


 public class Q5 implements MyInterface2 {
     public static void main(String[] args) {
         new Q5().display();
     }
 }
