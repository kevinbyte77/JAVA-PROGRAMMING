public class Calculator {
    static int calculationCount = 0;

    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    int subtract(int a, int b) {
        calculationCount++;
        return a - b;
    }

    int multiply(int a, int b) {
        calculationCount++;
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        calculationCount++;
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);
        int prod = calc.multiply(10, 5);
        int quot = calc.divide(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division: " + quot);

        System.out.println("Total calculations performed: " + Calculator.calculationCount);
    }
}
