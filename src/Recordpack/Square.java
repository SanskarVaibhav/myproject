package Recordpack;

public class Square extends shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
