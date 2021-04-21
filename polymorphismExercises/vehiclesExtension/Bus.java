package polymorphismExercises.vehiclesExtension;

public class Bus extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    public void reduceConsumption() {
        this.setConsumption(this.getConsumption() - 1.4);
    }
}