package properties.inheritance;

public class box {
double l;
double w;
double h;
box(double l, double w, double h) {
    this.l = l;
    this.w = w;
    this.h = h;
}
box() {
    this.l = l;
    this.w =w ;
    this.h = h;   
}
box(double l, double w) {
    this.l = l;
    this.w = w;
    this.h = h; // Default height
}
box(double side) {
    this.l = side;
    this.w = side; // Default width
    this.h = side; // Default height
}
box(box old) {
    this.l = old.l;
    this.w = old.w;
    this.h = old.h;
}
}