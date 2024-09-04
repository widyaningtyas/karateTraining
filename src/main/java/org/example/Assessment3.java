package org.example;

import java.time.Year;

class Vehicle {

    String brand = "Toyota";
    String model = "Avanza";
    int year = 0;
    public Vehicle (int varYear) throws InvalidYearException {
        year = varYear;
        yearCalculation();
    }

    public Vehicle (int varYear, String varBrand) throws InvalidYearException {
        year = varYear;
        brand = varBrand;
        yearCalculation();
    }

    public Vehicle (int varYear, String varBrand, String varModel) throws InvalidYearException {
        year = varYear;
        brand = varBrand;
        model = varModel;
        yearCalculation();
    }

    public void vehicleSound() {
        System.out.println("Vehicle sound : tinung tinung");
        System.out.println("The vehicle is " + brand + " with model " + model);
        System.out.println("");
    }

    public void yearCalculation() throws InvalidYearException {
        int currYear = Year.now().getValue();

        if (year > currYear) {
            throw new InvalidYearException("Invalid year, current is (" + currYear + ")");
        }
    }
}

class Car extends Vehicle {

    int doorNumb = 0;
    public Car(int varYear) throws InvalidYearException {
        super(varYear);
    }

    public Car(int varYear, String varBrand) throws InvalidYearException {
        super(varYear, varBrand);
    }

    public Car(int varYear, String varBrand, String varModel) throws InvalidYearException {
        super(varYear, varBrand, varModel);
    }

    public Car(int varYear, int varNumbDoor) throws InvalidYearException {
        super(varYear);
        doorNumb = varNumbDoor;
    }

    @Override
    public void vehicleSound() {
        System.out.println("Car sound : telolet telolet");
        System.out.println("Cars year is " + year + " door number is " + doorNumb + "");
        System.out.println("");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSideCars = false;

    public Motorcycle(int varYear) throws InvalidYearException {
        super(varYear);
    }

    public Motorcycle(int varYear, String varBrand) throws InvalidYearException {
        super(varYear, varBrand);
    }

    public Motorcycle(int varYear, String varBrand, String varModel) throws InvalidYearException {
        super(varYear, varBrand, varModel);
    }

    public Motorcycle(int varYear, boolean varSideCar) throws InvalidYearException {
        super(varYear);
        hasSideCars = varSideCar;
    }

    @Override
    public void vehicleSound() {
        System.out.println("Motorcycle sound : tin tin");
        System.out.println("Motorcycle year is " + year + " has sidecar : " + hasSideCars);
        System.out.println("");
    }
}

class InvalidYearException extends Exception {
        public InvalidYearException(String message) {
        super(message);
    }
}

public class Assessment3 {
    public static void main(String[] args) throws InvalidYearException {
        Vehicle vehicle = new Vehicle(1950);
        vehicle.vehicleSound();

        Vehicle vehicle2 = new Vehicle(2024, "Honda", "Jazz");
        vehicle2.vehicleSound();

        Car car = new Car(2020) ;
        car.vehicleSound();

        Car car2 = new Car(2020, 5);
        car2.vehicleSound();

        Motorcycle motorcycle = new Motorcycle(1998, true);
        motorcycle.vehicleSound();


        Motorcycle motorcycle2 = new Motorcycle(2024, false);
        motorcycle.vehicleSound();

        boolean exception = false;
        try {
            Car car3 = new Car(2222, "Civic Turbo", "QWERT123");
            car3.vehicleSound();
        } catch (InvalidYearException e) {
            exception = true;
            System.out.println("Error : " + e.getMessage());
        } finally {
            if (exception) {
                System.out.println("Object successfully created");
            } else {
                System.out.println("Object failed created");
            }
        }
    }

}
