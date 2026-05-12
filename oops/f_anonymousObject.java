class A {
    // Constructor → runs automatically when object is created
    public A() {
        System.out.println("object created");
    }

    // Method of class A
    public void show() {
        System.out.println("in A show");
    }
}

public class f_anonymousObject {
    public static void main(String a[]) {
        // Normal variable declaration
        int marks;
        marks = 99;

        // ---------------- ANONYMOUS OBJECT ----------------

        // Object created without storing reference
        new A();

        // Anonymous object with method call
        new A().show();

        // ---------------- NORMAL OBJECT ----------------

        // Reference variable declaration
        A obj;

        // Object creation and reference assignment
        obj = new A();

        // Method call using reference variable
        obj.show();
    }
}