package polymorphismExercises.vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuel;
    private double consumption;

    public Vehicle(double fuel, double consumption) {
        this.fuel = fuel;
        this.consumption = consumption;
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
        this.fuel+=liters;
    }
    @Override
    public String toString(){
        return String.format(this.getClass().getSimpleName()+ ": %.2f",this.fuel);
    }
}