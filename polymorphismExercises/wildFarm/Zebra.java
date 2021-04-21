package polymorphismExercises.wildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight,  livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    public void eat(Food food) {
        if(food instanceof Meat){
            throw new IllegalArgumentException("Zebras are not " +
                    "eating " +
                    "that type of food!");
        }
        super.eat(food);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
