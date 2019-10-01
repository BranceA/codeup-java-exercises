package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.length);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }


}
