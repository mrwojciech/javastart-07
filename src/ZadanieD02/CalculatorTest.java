package ZadanieD02;

public class CalculatorTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(10);

        System.out.println("Pole prostokata o bokach"+rectangle.sideA+
        ", "+rectangle.sideB+" wynosi: "+ ShapeCalculator.squareRectangle(rectangle));


        System.out.println("Obwod prostokata o bokach"+rectangle.sideA+
                ", "+rectangle.sideB+" wynosi: "+ ShapeCalculator.perimeterRectangle(rectangle));

        System.out.println("Pole kola o promieniu: "+circle.radius+
                 " wynosi: "+ ShapeCalculator.squareCircle(circle));

        System.out.println("Obwod koła o promieniu: "+circle.radius
                +" wynosi: "+ ShapeCalculator.perimeterCircle(circle));
    }
}
