package Assgn.second;

// Base class
class Animals {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class from Animal
class Mammal extends Animals {
    public void walk() {
        System.out.println("This mammal walks on legs.");
    }
}

// Derived class from Mammal
class Dogs extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class asgn13 {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.eat(); // Method inherited from Animal class
        dog.walk(); // Method inherited from Mammal class
        dog.bark(); // Method from Dog class
    }
}
