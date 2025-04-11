package Exception_handle;

public class Main_Driver {
    public static void main(String[] args) {
        try {
            Car car = new Car("Sedan", 10, 5);
            car.displayDetails();
            System.out.println("Car Rental Cost: $" + car.calculateRentalCost());
            System.out.println();
            Bike bike = new Bike("Mountain Bike", 8, 3);
            bike.displayDetails();
            System.out.println("Bike Rental Cost: $" + bike.calculateRentalCost());
            System.out.println();

            // testing invalid data for Car
            System.out.println("Testing with invalid data");
            Car invalidCar = new Car("Convertible", 12, -4);
            System.out.println("Car rental cost: "+invalidCar.calculateRentalCost());
        } catch (InvalidRentalDataException e) {
            System.out.println("Error: "+e.getMessage());
        }

        try {
            //testing invalid data for bike
            Bike invalidBike= new Bike("Road bike", 15, -2);
            System.out.println("Car rental cost: "+invalidBike.calculateRentalCost());
        } catch (InvalidRentalDataException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

}
