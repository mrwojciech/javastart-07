package Zadanie02;

public class User {

    private int age;
    private String name;
    private String surname;

    public User(String name, String surname, int age) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public void showInfo() {

        System.out.print("Imię: " + name + " Nazwisko: " + surname + " Wiek: " + age+" ");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
