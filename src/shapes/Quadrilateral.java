package shapes;
import java.io.Serializable;

abstract class Quadrilateral extends Shape implements Measurable, Serializable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    abstract void setWidth(double width);
}
