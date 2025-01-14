package clgOOps;
import java.util.*;

abstract class Animall {
    abstract void eat(); // Abstract method

    void sleep() { // Concrete method
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animall {
    @Override
    void eat() { // Implementing the abstract method
        System.out.println("Dog is eating.");
    }

    @Override
    void sleep() { // Overriding the concrete method
        System.out.println("Dog is sleeping.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animall a = new Dog(); // Polymorphism: Reference of abstract class, object of concrete class
        a.eat(); // Calls Dog's implementation of eat()
        a.sleep(); // Calls Dog's implementation of sleep()
    }
}
