import java.io.*;

public class EmployeeFileHandling
{
    public static void main(String[] args)
    {
        try
        {
            // Writing to file
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("Employee ID: 199\n");
            writer.write("Employee Name: Sushant\n");
            writer.write("Department: Computer Science\n");
            writer.write("Salary: 180000");

            writer.close();

            System.out.println("Employee details written successfully.\n");

            // Reading from file
            FileReader reader = new FileReader("employee.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("Employee Details:");

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
