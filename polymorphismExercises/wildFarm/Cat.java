package polymorphismExercises.wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;
    public Cat(String animalName, String animalType,
               Double animalWeight, String livingRegion,String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void eat(Food food) {

        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }
    @Override
    public String toString() {
        String pattern = "####.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return String.format(getAnimalType()+"[%s, %s, %s, %s, %d]", getAnimalName(),getBreed(),decimalFormat.format(getAnimalWeight()),getLivingRegion(),getFoodEaten());
        //Cat[Gray, Persian, 1.1, Home, 4]
    }
}
