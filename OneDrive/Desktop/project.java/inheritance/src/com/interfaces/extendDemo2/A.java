public interface  A {
    static void greeting(){
        System.out.println("Hello from static method");
    }
default void fun() {
        System.out.println("i am in A");
    }
}
