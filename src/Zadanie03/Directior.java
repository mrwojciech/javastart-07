package Zadanie03;

public class Directior extends Employee {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Directior(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(" bonus: "+bonus);
    }
}
