import java.util.Scanner;

// i) Base Class: Vehicle
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor to initialize fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display basic vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year:  " + year);
    }
}
// ii) Subclass: Car (Inherits from Vehicle)
class Car extends Vehicle {
    String fuelType;

    // Constructor initializing all fields, including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        // 'super' calls the constructor of the base class (Vehicle)
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent method to print brand, model, year
        System.out.println("Fuel Type: " + fuelType);
    }
}

// iii) Main Class: Showroom
public class Showroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Welcome to the Car Showroom ---");

        // Prompting user for inputs
        System.out.print("Enter Car Brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Car Model: ");
        String model = input.nextLine();

        System.out.print("Enter Year of Manufacture: ");
        int year = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        System.out.print("Enter Fuel Type (e.g., Petrol, Diesel, Electric): ");
        String fuelType = input.nextLine();

        // Instantiate the Car object using user-provided data
        Car myCar = new Car(brand, model, year, fuelType);

        // Display the car's details
        System.out.println("\n--- Displaying Car Details ---");
        myCar.displayDetails();

        // Close the scanner resource
        input.close();
    }
}