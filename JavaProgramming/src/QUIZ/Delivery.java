package QUIZ;

public interface Delivery {
    void calculateCost();
    void  trackDelivery();
    void  planRoute();
}

class CarDelivery implements Delivery {
    public double CAR_COST_PER_KM, distance;

    CarDelivery(double CAR_COST_PER_KM, double distance) {
        this.CAR_COST_PER_KM= CAR_COST_PER_KM;
        this.distance= distance;
    }

    public void calculateCost() {
        System.out.println("Total Car delivery cost: $"+distance*CAR_COST_PER_KM);
    }

    public void trackDelivery() {
        System.out.println("Tracking Car delivery...");
    }
    public void planRoute() {
        System.out.println("Planning road route for Car...");
    }
}

class BicycleDelivery implements Delivery {
    public double BIKE_COST_PER_KM, distance;

    BicycleDelivery(double BIKE_COST_PER_KM, double distance) {
        this.BIKE_COST_PER_KM= BIKE_COST_PER_KM;
        this.distance= distance;
    }

    public void calculateCost() {
        System.out.println("Total Bicycle delivery cost: $"+distance*BIKE_COST_PER_KM);
    }

    public void trackDelivery() {
        System.out.println("Tracking Bicycle delivery...");
    }
    public void planRoute() {
        System.out.println("Planning bike-friendly route for Car...");
    }
}

class Mainn {
    public static void main(String[] args) {
        CarDelivery cd= new CarDelivery(10, 5.5);
        BicycleDelivery bd= new BicycleDelivery(5, 10.10);
    
        cd.trackDelivery();
        cd.planRoute();
        cd.calculateCost();
        System.out.println("Delivery completed successfully");
        System.out.println();
        bd.trackDelivery();
        bd.planRoute();
        bd.calculateCost();
        System.out.println("Delivery completed successfully");   
    }
}
