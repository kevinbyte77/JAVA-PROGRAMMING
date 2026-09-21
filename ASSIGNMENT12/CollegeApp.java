import facultypackage.Faculty;
import studentpackage.Student;
public class CollegeApp {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Your Name", "Computer Science", 88.0);
        s1.displayStudentInfo();
        System.out.println();

        Faculty f1 = new Faculty(501, "Faculty Name", "Computer Science", "DBMS");
        f1.displayFacultyInfo();
    }
}