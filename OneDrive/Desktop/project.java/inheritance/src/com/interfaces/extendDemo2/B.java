public interface B {
   static void greet() {
      System.out.println("Greeting from interface B");
   }

   default void fun() {
      System.out.println("i am in B");
  }

}
