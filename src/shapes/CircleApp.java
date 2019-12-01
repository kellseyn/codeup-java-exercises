package shapes;


import util.Input;

public class CircleApp {


    Input input = new Input();


    public double getRadius() {
        System.out.println("INPUT THE NUMBER FOR A NEW CIRCLE: ");
        Circle circle = new Circle(input.getDouble());
        System.out.println("CIRCLE AREA IS: " + circle.getArea());
        System.out.println("CIRCLE CIRCUMFERENCE IS: " + circle.getCircumference());
        return input.getDouble();
    }

}
