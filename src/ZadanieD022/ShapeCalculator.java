package ZadanieD022;

public class ShapeCalculator {

    public double calculateArea(Rectangle rectangle) {
        return rectangle.sideA * rectangle.sideB;
    }

    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.radius, 2);
    }

    public double calculatrePerimeter(Rectangle rectangle) {
        return 2 * rectangle.sideB + 2 * rectangle.sideA;
    }

    public double calculatrePerimeter(Circle circle) {
        return 2 * Math.PI * circle.radius;
    }
}
