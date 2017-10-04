package Zadanie01;

public class TestCar {


    public static void main(String[] args) {

        Car car1 = Zadanie01.CarFactory.createCar();
        car1.showCar();
        Car car2 = CarFactory.createCar();
        car2.showCar();


    }

}
