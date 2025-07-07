public class Main implements A,B {
    @Override
    public void fun() {
        A.super.fun(); // Calls the default method from interface A
        
    }
    public void greeting() {
        // A.super.greeting(); // Cannot call static method from interface via super
        // Calls the static method from interface B
        System.out.println("Greeting from interface B");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greeting();
    
        A.greeting();
        B.greet(); // Calls the static method from interface B
        // B.fun(); // This will not work as B does not have a static method
        // Calling static method from interface A
    }

}
