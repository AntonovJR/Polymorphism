package polymorphismExercises.vehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuel;
    private double consumption;
    private double tankCapacity;

    public Vehicle(double fuel, double consumption, double tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.setFuel(fuel);
        this.consumption = consumption;

    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setFuel(double fuel) {
        validateFuel(fuel);
        validateTank(fuel);
        this.fuel = fuel;
    }
    private void validateFuel(double liters){
        if(liters<=0){
            throw new IllegalArgumentException("Fuel must be a positive number" );
        }
    }
    private void validateTank(double liters){
         if(liters>this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
    }

    public String drive(double distance) {
        if (distance * this.consumption > this.fuel) {
            return this.getClass().getSimpleName()+" needs refueling";
        } else {
            this.fuel -= distance * this.consumption;
            return this.getClass().getSimpleName() +
                    " travelled " + new DecimalFormat("#.##").format(distance) + " km";
        }
    }
    public void refuel(double liters) {
        validateFuel(liters);
        validateTank(liters);
        this.setFuel(this.fuel+liters);
    }
    @Override
    public String toString(){
        return String.format(this.getClass().getSimpleName()+ ": %.2f",this.fuel);
    }

}