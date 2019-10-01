package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    public double getWidth(){
        return this.width;
    }

}
