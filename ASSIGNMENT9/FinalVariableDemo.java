class FinalVariableExample {
    final int age = 25; // final variable - value cannot be changed once assigned

    void display() {
        System.out.println("Age: " + age);
        // age = 30; // uncommenting this line will give a compile-time error
    }
}

public class FinalVariableDemo {
    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.display();
    }
}