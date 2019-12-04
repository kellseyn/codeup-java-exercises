package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    @Override
    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public int getArea() {
        return length * width;
    }

}
