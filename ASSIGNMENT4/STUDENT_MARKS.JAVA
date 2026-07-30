import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] marksStr = new String[5];

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < marksStr.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marksStr[i] = sc.nextLine();
        }

        int total = 0;

        for (String mark : marksStr) {
            Integer marksValue = Integer.parseInt(mark); // String -> Integer
            total += marksValue; 
        }

        double average = total / (double) marksStr.length;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}