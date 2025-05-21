public class method_overloading {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 5 and 10: " + calc.add(5, 10)); // Calls first method
        System.out.println("Sum of 1, 2 and 3: " + calc.add(1, 2, 3)); // Calls second method
        System.out.println("Sum of 4.5 and 3.2: " + calc.add(4.5, 3.2)); // Calls third method
    }
}

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}