class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls the parent class's display method
        System.out.println("This is the child class.");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
