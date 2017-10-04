package Zadanie02;

public class Test {

    public static void main(String[] args) {


        Customer customer = new Customer(1,true, "Jarek","Grecki ", 22);

        Employee employee = new Employee(1,"manager", "Janek","Wisniewski", 22);

        customer.showInfo();
        System.out.println();
        employee.showInfo();
    }
}
