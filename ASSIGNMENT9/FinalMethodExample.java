class Parent {
    public final void display() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
    // Uncommenting the below method will cause a compilation error
    // because we cannot override a final method.
    /*
    public void display() {
        System.out.println("This is an attempt to override the final method.");
    }
    */
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); // Calls the final method from the Parent class
    }
}