package polymorphismExercises.vehicles;

public class Car extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION =
            0.9;

    private double fuel;
    private double consumption;

    public Car(double fuel, double consumption) {
        super(fuel,consumption
                + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION);
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
