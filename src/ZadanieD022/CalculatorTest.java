package ZadanieD022;

public class CalculatorTest {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];

        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(10);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Pole prostokata o bokach" + ((Rectangle) shapes[0]).sideA +
                ", " + ((Rectangle) shapes[0]).sideB + " wynosi: " + shapeCalculator.calculateArea(((shapes[0]))));


        System.out.println("Obwod prostokata o bokach" + ((Rectangle) shapes[0]).sideA +
                ", " + ((Rectangle) shapes[0]).sideB + " wynosi: " + shapeCalculator.calculatrePerimeter(((shapes[0]))));

        System.out.println("Pole kola o promieniu: " + ((Circle) shapes[1]).radius +
                " wynosi: " + shapeCalculator.calculateArea(shapes[1]));

        System.out.println("Obwod koła o promieniu: " + ((Circle) shapes[1]).radius
                + " wynosi: " + shapeCalculator.calculatrePerimeter(shapes[1]));
    }
}
