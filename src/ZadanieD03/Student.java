package ZadanieD03;

public class Student extends Human{


    private String surname;
    private int yearOfStudy;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Student(String firstName, String surname, int yearOfStudy) {
        super(firstName);
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
    }

    public void show (){
        System.out.println("Imie: "+firstName+" Nazwisko: "+ surname+" studiuje na roku: "+yearOfStudy);
    }

}
