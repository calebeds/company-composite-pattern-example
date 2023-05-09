import company.Developer;
import company.Directory;
import company.Employee;
import company.Manager;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer( "Calebe Oliveira", 100, "Pro Developer");
        Employee dev2 = new Developer( "Asaf Oliveira", 101, "Entry Level Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee manager1 = new Manager("Fulana Da Silva", 200, "SEO Manager");
        Employee manager2 = new Manager("Aquiles Oliveira", 201, "Myra's Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(manager1);
        accDirectory.addEmployee(manager2);

        Directory company = new Directory();
        company.addEmployee(engDirectory);
        company.addEmployee(accDirectory);
        company.showEmployeeDetails();
    }
}