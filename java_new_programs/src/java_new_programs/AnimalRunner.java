package java_new_programs;

public class AnimalRunner {

    public static void main(String[] args) {

        Animal1[] animals = { new Dog(), new Cat() };
        
        for (Animal1 animal : animals) {
            animal.bark();
        }
    }
}



/*

Certainly, I can explain the differences between the two programs you provided.

Program 1: FlyableRunner and Flyable Interface

java
Copy code
package java_new_programs;

public class FlyableRunner {

    public static void main(String[] args) {

        Flyable[] flys = { new Bird(), new Aeroplane() };
        
        for (Flyable flyable : flys) {
            flyable.fly();
        }
    }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Aeroplane is flying");
    }
}
Program 2: AnimalRunner and Animal1 Abstract Class

java
Copy code
package java_new_programs;

public class AnimalRunner {

    public static void main(String[] args) {

        Animal1[] animals = { new Dog(), new Cat() };
        
        for (Animal1 animal : animals) {
            animal.bark();
        }
    }
}

abstract class Animal1 {
    public void bark() {
        getDog();
        getCat();
    }

    abstract void getDog();
    abstract void getCat();
}

class Dog extends Animal1 {
    @Override
    void getDog() {
        System.out.println("Dog barks");
    }

    @Override
    void getCat() {
        // Dog doesn't make cat sounds
    }
}

class Cat extends Animal1 {
    @Override
    void getDog() {
        // Cat doesn't make dog sounds
    }

    @Override
    void getCat() {
        System.out.println("Cat meows");
    }
}
Here are the key differences between the two programs:

Purpose and Domain:

FlyableRunner and Flyable Interface: This program demonstrates a basic example of using an interface Flyable to define a common behavior (fly()) that is implemented by two different classes (Bird and Aeroplane) which represent flying objects.
AnimalRunner and Animal1 Abstract Class: This program demonstrates the concept of abstract classes and method overriding. It defines an abstract class Animal1 with two abstract methods (getDog() and getCat()), and then provides concrete implementations of these methods in the Dog and Cat subclasses.
Concept Used:

FlyableRunner: Interfaces and implementing interface methods.
AnimalRunner: Abstract classes, method overriding, and inheritance.
Method of Achieving Common Behavior:

FlyableRunner: Achieves common behavior through interface implementation (fly() method).
AnimalRunner: Achieves common behavior through inheritance and method overriding (bark(), getDog(), getCat() methods).
Objects and Behavior:

FlyableRunner: Deals with different flying objects (Bird and Aeroplane) and their ability to fly.
AnimalRunner: Deals with different animals (Dog and Cat) and their ability to bark or meow.
Usage of Abstract Classes:

FlyableRunner: Does not use abstract classes.
AnimalRunner: Uses an abstract class Animal1 to define common behavior and enforce method implementation in subclasses.
*/
