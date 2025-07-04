package properties.inheritance;

public class Main {
public static void main(String[] args) {
    box b = new box(1.0, 3.0, 3.0);
    System.out.println("Box dimensions: " + b.l + " x " + b.w + " x " + b.h);
    box b2 = new box(2.0, 4.0);
    System.out.println("Box dimensions: " + b2.l + " x " + b2.w + " x " + b2.h);
    box b3 = new box(5.0);
    System.out.println("Box dimensions: " + b3.l + " x " + b3.w + " x " + b3.h);
    box b4 = new box();
    System.out.println("Box dimensions: " + b4.l + " x " + b4.w + " x " + b4.h);
    boxprice bp = new boxprice(2.0, 3.0, 4.0, 100.0);
    System.out.println("Box price: " + bp.cost);
}
}
