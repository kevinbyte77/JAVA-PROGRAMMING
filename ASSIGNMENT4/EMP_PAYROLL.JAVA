import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String empIdStr = sc.nextLine();
        Integer empId = Integer.valueOf(empIdStr); // String -> Integer object

        System.out.print("Enter Basic Salary: ");
        String salaryStr = sc.nextLine();
        Double basicSalary = Double.valueOf(salaryStr); // String -> Double object

        System.out.print("Enter Bonus Amount: ");
        String bonusStr = sc.nextLine();
        Double bonus = Double.valueOf(bonusStr); // String -> Double object

        if (basicSalary.doubleValue() <= 0) {
            System.out.println("Invalid basic salary! Must be greater than 0.");
        } else if (bonus.doubleValue() < 0) {
            System.out.println("Invalid bonus amount! Cannot be negative.");
        } else {
            double netSalary = basicSalary + bonus; 

            System.out.println("\n---- Payroll Slip ----");
            System.out.println("Employee ID: " + empId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Net Salary: " + netSalary);
        }

        sc.close();
    }
}