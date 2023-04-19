package homeworks.members;

import homeworks.members.Employee;
import homeworks.members.Manager;

public class CreatingObjects {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob",45,"+28335082","Street",1000,"Worker");
        Manager manager = new Manager("Nick",45,"+28335082","Street",2000,"Sales");

        employee.printSalary();
        manager.printSalary();

    }
}
