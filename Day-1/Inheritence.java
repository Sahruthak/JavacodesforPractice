// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car accelerating...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();

        // Accessing methods from both Vehicle and Car
        myCar.start();
        myCar.accelerate();
    }
}
