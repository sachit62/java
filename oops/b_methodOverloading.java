// Method Overloading Example

class Calculator {

    // Method 1: takes 3 integer parameters
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Method 2: takes 2 integer parameters
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Method 3: takes 1 double and 1 integer parameter
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

// Main class
public class b_methodOverloading {

    public static void main(String[] args) {

        // Creating object of Calculator class
        Calculator obj = new Calculator();

        // Calling add() method with 2 integer arguments
        int r1 = obj.add(3, 4);

        // Printing result
        System.out.println(r1);
    }
}