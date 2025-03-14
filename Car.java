/*
Name: Francis Njoroge
RegNo: ct101/g/19667/23
Assingment 4
Car.java code
Date: 7/3/2025
 */
class Car {
    // Private attributes to enforce encapsulation
    private String licensePlate;
    private boolean isRented;

    // Constructor to initialize the car with a license plate
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // Car is available by default
    }

    // Public method to rent the car (only if available)
    public void rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car with license plate " + licensePlate + " has been rented.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already rented.");
        }
    }

    // Public method to return the car (mark as available)
    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car with license plate " + licensePlate + " has been returned.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " was not rented.");
        }
    }

    // Getter method to check if the car is rented
    public boolean isCarRented() {
        return isRented;
    }

    public static void main(String[] args) {
        // Demonstrating encapsulation
        Car car1 = new Car("KDK 238H");

        car1.rentCar();   // Should allow renting
        car1.rentCar();   // Should not allow renting again
        car1.returnCar(); // Should allow returning
        car1.returnCar(); // Should not allow returning again

        System.out.println("Is car rented? " + car1.isCarRented()); // Check status
    }
}

