package Zadanie01;

import Zadanie01.Car;

import java.util.Scanner;

public class CarFactory {

    static Car createCar() {
        String name;
        double heavy;
        int speedLimit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe auta: ");
        name = scanner.nextLine();
        System.out.println("Podaj spalanie na 100km: ");
        heavy = scanner.nextDouble();
        System.out.println("Podaj limit predkosci: ");
        speedLimit = scanner.nextInt();
        Car car = new Car(name, heavy, speedLimit);
        scanner.close();
        return car;
    }


}
