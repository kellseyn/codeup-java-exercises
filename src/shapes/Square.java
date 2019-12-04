package shapes;

public class Square extends Quadrilateral{

    @Override
    public int getPerimeter() {

        return 4 * length;
    }

    @Override
    public int getArea() {

        return length * length;
    }
}
