package ZadanieD03;

public class Teacher extends Human{


    private String lastName;
    private int workExperience;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public Teacher(String firstName, String lastName, int workExperience) {
        super(firstName);
        this.lastName = lastName;
        this.workExperience = workExperience;
    }

    public void show() {
        System.out.println("Imie: " + firstName + " Nazwisko: " + lastName + " pracuje od: " + workExperience+" lat");
    }

}
