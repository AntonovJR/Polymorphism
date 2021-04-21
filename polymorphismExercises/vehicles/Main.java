package polymorphismExercises.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(tokens[1])
                , Double.parseDouble(tokens[2]));
        tokens = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(tokens[1])
                , Double.parseDouble(tokens[2]));
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String command = scanner.nextLine();
            String[] params = command.split("\\s+");
            if (command.contains("Drive")) {
                if (params[1].equals("Car")) {
                    System.out.println(car.drive(Double.parseDouble(params[2])));
                } else {
                    System.out.println(truck.drive(Double.parseDouble(params[2])));
                }
            } else {
                if (params[1].equals("Car")) {
                    car.refuel(Double.parseDouble(params[2]));
                } else {
                    truck.refuel(Double.parseDouble(params[2]));
                }

            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());

    }

}
