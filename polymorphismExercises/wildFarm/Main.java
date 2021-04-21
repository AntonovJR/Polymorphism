package polymorphismExercises.wildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Animal> animalList = new ArrayList<>();
        List<Food> foodList = new ArrayList<>();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            Animal animal;
            switch (tokens[0]) {

                case "Cat":
                    animal = new Cat(tokens[1], tokens[0], Double.parseDouble(tokens[2]),
                            tokens[3], tokens[4]);

                    break;
                case "Tiger":
                    animal = new Tiger(tokens[1], tokens[0], Double.parseDouble(tokens[2]),
                            tokens[3]);
                    break;
                case "Mouse":
                    animal = new Mouse(tokens[1], tokens[0], Double.parseDouble(tokens[2]),
                            tokens[3]);
                    break;

                case "Zebra":
                    animal = new Zebra(tokens[1], tokens[0], Double.parseDouble(tokens[2]),
                            tokens[3]);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown animal type"+ tokens[0]);
            }
            tokens = scanner.nextLine().split("\\s+");
            Food food;
            switch (tokens[0]){
                case "Meat":
                    food= new Meat(Integer.parseInt(tokens[1]));
                    break;
                case "Vegetable":
                    food = new Vegetable(Integer.parseInt(tokens[1]));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown food type"+ tokens[0]);
            }
            animal.makeSound();
            try {
                animal.eat(food);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            animalList.add(animal);
            input = scanner.nextLine();
        }
        for (Animal animal : animalList) {
            System.out.println(animal.toString());

        }
    }
}
