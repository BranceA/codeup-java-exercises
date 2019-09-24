package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input circleInput = new Input();
        System.out.println("Please enter the radius of your circle.");
        double circleRadius = circleInput.getDouble();
        Circle thisCircle = new Circle(circleRadius);
        System.out.println("The area of this circle is: " + thisCircle.getArea());
        System.out.println("The circumference of this circle is: " + thisCircle.getCircumference());

    }

}
