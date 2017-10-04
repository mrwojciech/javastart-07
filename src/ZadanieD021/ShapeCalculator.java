package ZadanieD021;

public class ShapeCalculator {


    public static double squareRectangle(Rectangle rectangle) {
        return rectangle.sideA * rectangle.sideB;
    }


    public static double squareCircle(Circle circle) {
        return Math.PI * Math.pow(circle.radius,2);
    }

    public static double perimeterRectangle(Rectangle rectangle) {

        return 2*rectangle.sideB+2*rectangle.sideA;
    }

    public static double perimeterCircle(Circle circle) {
        return 2*Math.PI*circle.radius;
    }
}
