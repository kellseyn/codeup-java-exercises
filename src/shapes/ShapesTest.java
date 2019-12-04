package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle();
        Measurable myShape2 = new Square();

        ((Rectangle) myShape).length = 4;
        ((Rectangle) myShape).width = 5;

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}
