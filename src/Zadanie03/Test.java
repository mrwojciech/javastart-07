package Zadanie03;

public class Test {

    public static void main(String[] args) {

        Person[] persons = new Person[5];

        persons[0] = new Employee("Janek", "Samek", 12345);
        persons[1] = new Directior("Jacek", "Placek", 33333, 1000);

        for (Person person : persons) {

            if (person != null) {
                person.showInfo();
                System.out.println();
            }
        }

    }
}
