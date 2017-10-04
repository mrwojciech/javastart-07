package ZadanieD022;

import sun.security.provider.SHA;

public class ShapeCalculator {

    public double calculateArea(Shape shape) {
        if (shape instanceof Rectangle) {

            return ((Rectangle) shape).sideA * ((Rectangle) shape).sideB;
        }

        if (shape instanceof Circle) {

            return Math.PI * Math.pow(((Circle) shape).radius, 2);
        }
        return 0;
    }

    public double calculatrePerimeter(Shape shape) {
        if (shape instanceof Rectangle) {

            return 2 * ((Rectangle) shape).sideB + 2 * ((Rectangle) shape).sideA;
        }
        if (shape instanceof Circle) {
            return 2 * Math.PI * ((Circle) shape).radius;

        }
        return 0;
    }

}
