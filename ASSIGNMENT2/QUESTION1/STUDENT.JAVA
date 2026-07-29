public class Student {
    // Instance variables
    String name;
    int rollNumber;

    // Default constructor
    public Student() {
        name = "Unknown";
        rollNumber = 0;
    }

    // Parameterized constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // Using parameterized constructor
        Student s2 = new Student("Kevin", 21);
        s2.display();
    }
}
