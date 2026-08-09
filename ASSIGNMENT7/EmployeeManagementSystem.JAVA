
interface Payable {
    void calculateSalary();
}

// Base class - common properties/behavior for all employees
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
}

class FullTimeEmployee extends Employee implements Payable {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public void calculateSalary() {
        System.out.println("Monthly Salary: Rs. " + monthlySalary);
    }
}

class Contractor extends Employee implements Payable {
    double hourlyRate;
    int hoursWorked;

    Contractor(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        double total = hourlyRate * hoursWorked;
        System.out.println("Contract Payment: Rs. " + total);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        FullTimeEmployee emp1 = new FullTimeEmployee("Kevin", 101, 45000);
        Contractor emp2 = new Contractor("Riya", 102, 500, 80);

        System.out.println("--Full-Time Employee ---");
        emp1.displayDetails();
        emp1.calculateSalary();

        System.out.println("\n-- Contractor -");
        emp2.displayDetails();
        emp2.calculateSalary();
    }
}