package polymorphismExercises.vehicles;

public class Truck extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION =
            1.6;

    private double fuel;
    private double consumption;

    public Truck(double fuel, double consumption) {
        super(fuel, consumption
                + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION);
    }

    public String drive(double distance) {
        return super.drive(distance);
    }

    public void refuel(double liters) {
        super.refuel(liters*0.95);
    }

    public String toString() {
        return super.toString();
    }
}
