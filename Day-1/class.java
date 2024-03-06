// Class definition
class Person {
    // Data members
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);

        // Accessing object methods
        person1.displayDetails();
        System.out.println("--------");
        person2.displayDetails();
    }
}
