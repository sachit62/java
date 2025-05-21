public class overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Calls superclass method
        myAnimal.sound();                // Output: Animal makes a sound

        Animal myDog = new Dog();        // Polymorphism in action
        myDog.sound();                   // Output: Dog barks
    }
}

class Animal {
    // Superclass method
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
