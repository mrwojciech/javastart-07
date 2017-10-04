package Zadanie02;

public class Employee extends User {

    private int experience;
    private String position;

    public Employee(int experience, String position, String name, String surname, int age) {
        super(name, surname, age);
        this.experience = experience;
        this.position = position;
    }

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public void showInfo() {
        super.showInfo();
        System.out.println("Ile lat doswiadczenia: " + experience);
        System.out.println("Stanowisko: " + position);


    }
}
