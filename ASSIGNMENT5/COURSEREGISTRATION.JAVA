import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Course Registration Menu ----");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter course name to register: ");
                    String course = sc.nextLine();
                    courses.add(course);
                    System.out.println("Course registered!");
                    break;

                case 2:
                    System.out.print("Enter course name to remove: ");
                    String removeCourse = sc.nextLine();
                    if (courses.remove(removeCourse)) {
                        System.out.println("Course removed!");
                    } else {
                        System.out.println("Course not found!");
                    }
                    break;

                case 3:
                    StringBuffer sb = new StringBuffer();
                    sb.append("---- Registered Courses ----\n");

                    if (courses.isEmpty()) {
                        sb.append("No courses registered yet.");
                    } else {
                        for (int i = 0; i < courses.size(); i++) {
                            sb.append(i + 1).append(". ").append(courses.get(i)).append("\n");
                        }
                    }
                    System.out.println(sb.toString());
                    break;

                case 4:
                    System.out.println("Exiting Course Registration. Bye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}