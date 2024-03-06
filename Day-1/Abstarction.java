// Abstract class with abstract method
abstract class Animal {
    // Abstract method for making a sound
    public abstract void makeSound();
}

// Concrete class implementing the abstract class
class Dog extends Animal {
    // Implementation of the abstract method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Concrete class implementing the abstract class
class Cat extends Animal {
    // Implementation of the abstract method
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Using the abstract class reference to achieve data abstraction
        Animal animal1 = myDog;
        Animal animal2 = myCat;

        // Making sounds without knowing the specific details of each animal
        animal1.makeSound();
        animal2.makeSound();
    }
}
