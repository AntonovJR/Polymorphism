package polymorphismExercises.wildFarm;


public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten = 0;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public void makeSound() {
    }

    public String getAnimalType() {
        return animalType;
    }

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }


    public String getAnimalName() {
        return animalName;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }
}
