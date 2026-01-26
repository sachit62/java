// Encapsulation = wrapping data (variables) and methods into a single unit (class)
// and restricting direct access using private variables + getters/setters.

class Human
{
    // private variables → cannot be accessed directly from outside the class
    private int age;
    private String name;

    // -------- DEFAULT CONSTRUCTOR --------
    // Called when no arguments are passed while creating object
	// when not called default constructor is used by java only which is blank here we are doing it explicitly
    public Human() {
        age = 0;
        name = "Unknown";
    }

    // -------- PARAMETERIZED CONSTRUCTOR --------
    // Called when values are passed while creating object
    public Human(int age, String name) {
        this.age = age;   // this.age = instance variable, age = parameter
        this.name = name;
    }

    // -------- GETTER --------
    // Used to read private variable
    public int getAge() {
        return age;
    }

    // -------- SETTER --------
    // Used to modify private variable
    public void setAge(int age) {
        this.age = age;  // current object's age = parameter age
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class c_encapsulation {
    public static void main(String[] args)
    {
        // Object using DEFAULT constructor
        Human obj1 = new Human();
        obj1.setAge(30);
        obj1.setName("Reddy");

        // Object using PARAMETERIZED constructor
        Human obj2 = new Human(25, "Navin");

        // Direct access is not allowed (because variables are private)
        // obj1.age = 10;   ❌
        // obj1.name = "ABC"; ❌

        // Accessing data using getters
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}
