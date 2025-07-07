public class Main implements B {
    @Override
    public void fun() {
        System.out.println("Function from interface A");
    }

    @Override
    public void greet() {
        System.out.println("Greeting from interface B");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greet();
    }
}
