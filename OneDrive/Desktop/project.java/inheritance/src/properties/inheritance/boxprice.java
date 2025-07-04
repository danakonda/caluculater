package properties.inheritance;

public class boxprice extends box {
    double cost;
    boxprice(){
    super();
    this.cost = -1;
    }
boxprice(boxprice other, double w) {
    super(other);
    this.w = w;
    this.cost = other.cost;
}
boxprice(double l, double w, double h, double cost) {
    super(l, w, h);
    this.cost = cost;
}boxprice(double side, double cost) {
    super(side);
    this.cost = cost;
}}