// inheritance implementation

public class inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
    }
}

// base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}
