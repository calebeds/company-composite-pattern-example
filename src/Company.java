import company.Developer;
import company.Manager;
import company.Employee;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer( "Calebe Oliveira", 100, "Pro Developer");
        Employee dev2 = new Developer( "Asaf Oliveira", 101, "Entry Level Developer");

        Manager engManager= new Manager("Mike", 2000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer("Tom", 102, "Developer");

        Manager generalManager = new Manager("Mark", 50000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();
    }
}