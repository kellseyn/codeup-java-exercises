package shapes;

public class Circle {
    private double radius;

    public double getArea() {
        return  3.14 * (radius * radius);
    }
    public double getCircumference() {
        return 2 * 3.14 * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

}
