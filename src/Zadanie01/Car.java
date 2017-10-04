package Zadanie01;

public class Car {

    private String name;
    private double heavy;
    private int speedLimit;
    public static int carNumber = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeavy() {
        return heavy;
    }

    public void setHeavy(double heavy) {
        this.heavy = heavy;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public Car(String name, double heavy, int speedLimit) {
        this.name = name;
        this.heavy = heavy;
        this.speedLimit = speedLimit;
        carNumber++;

    }


    public void showCar() {

        System.out.println("Nazwa: " + name);

        System.out.println("Spalanie: " + heavy);

        System.out.println("Speed limit: " + speedLimit);

        System.out.println("Utworzyłem aut: "+ carNumber);

    }

}
