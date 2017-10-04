package ZadanieD021;

public class CalculatorTest {

    public static void main(String[] args) {

        Shape[] shapes =new Shape[5];

        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(10);

        System.out.println("Pole prostokata o bokach"+((Rectangle)shapes[0]).sideA+
        ", "+((Rectangle)shapes[0]).sideB+" wynosi: "+ ShapeCalculator.squareRectangle(((Rectangle)shapes[0])));


        System.out.println("Obwod prostokata o bokach"+((Rectangle)shapes[0]).sideA+
                ", "+((Rectangle)shapes[0]).sideB+" wynosi: "+ ShapeCalculator.perimeterRectangle(((Rectangle)shapes[0])));

        System.out.println("Pole kola o promieniu: "+((Circle)shapes[1]).radius+
                 " wynosi: "+ ShapeCalculator.squareCircle((Circle)shapes[1]));

        System.out.println("Obwod koła o promieniu: "+((Circle)shapes[1]).radius
                +" wynosi: "+ ShapeCalculator.perimeterCircle(((Circle)shapes[1])));
    }
}
