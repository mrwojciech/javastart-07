package Zadanie02;

public class Customer extends User {

    private int duration;
    private boolean isMember;


    public Customer() {
        super(null,null,0);
    }

    public Customer(int duration, boolean isMember, String name, String surname, int age)

    {
        super(name,surname,age);

        this.duration = duration;
        this.isMember = isMember;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Ile lat jest klientem: " + duration);
        System.out.println("Czy ma karte membership: " + isMember);
    }
}
