package polymorphismExercises.vehiclesExtension;

public class Car extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION =
            0.9;

    public Car(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption+AIR_CONDITIONER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override

    public String drive(double distance) {
      return super.drive(distance);
    }
    public void refuel(double liters) {
       super.refuel(liters);
    }

    public String toString(){
        return super.toString();
    }
}
