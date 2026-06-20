
class Circle{
double radiuse;

double getarea() {
    return 3.14 * radiuse * radiuse;
}
}
public class oop1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radiuse=5;

        System.out.println("Radius is  "+ c1.radiuse);
        System.out.println("area:  " +c1.getarea());
    }
}
