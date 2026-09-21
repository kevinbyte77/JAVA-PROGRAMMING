import java.io.*;

public class PatientFileHandling
{
    public static void main(String[] args)
    {
        try
        {
            // Writing to file
            FileWriter writer = new FileWriter("patient.txt");

            writer.write("Patient ID: 25070122199\n");
            writer.write("Patient Name: SUSHANT YADAV\n");
            writer.write("Age: 20\n");
            writer.write("Diagnosis: Fever");

            writer.close();

            System.out.println("Patient details written successfully.\n");

            // Reading from file
            FileReader reader = new FileReader("patient.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("Patient Details:");

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