package Week13;

import java.util.Scanner;

public class BicycleFleetApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Bike Workout Planner!");

        // Create an array of bicycles
        Bicycle[] bicycleFleet = new Bicycle[6];
        int bicycleCount = 0;

        while (true) {
            System.out.println("\n--- Add a Bicycle ---");
            System.out.print("Enter the owner's name: ");
            String owner = input.nextLine();

            System.out.print("Enter the type of bike (road, mountain, hybrid): ");
            String type = input.nextLine();

            System.out.print("Enter the bike's gear: ");
            int gear = input.nextInt();

            System.out.print("Enter the bike's cadence (RPM): ");
            int cadence = input.nextInt();

            System.out.print("Enter the bike's current speed (MPH): ");
            int speed = input.nextInt();
            input.nextLine(); // Consume leftover newline

            // Create and add the new Bicycle to the fleet
            bicycleFleet[bicycleCount] = new Bicycle(cadence, speed, gear, type, owner);
            bicycleCount++;

            // Ask if the user wants to add another bike
            if (bicycleCount == 6) {
                System.out.println("\nFleet is full. No more bicycles can be added.");
                break;
            }

            System.out.print("\nWould you like to add another bicycle? (yes/no): ");
            String response = input.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // Print information about all bicycles in the fleet
        System.out.println("\n--- Bicycle Fleet Information ---");
        for (int i = 0; i < bicycleCount; i++) {
            System.out.println("\nBicycle " + (i + 1) + ":");
            System.out.println(bicycleFleet[i].getInfo());
        }

        System.out.println("\nThank you for using the Bike Workout Planner. Ride safe!");
        input.close();
    }

    public static void suggestWorkout(Bicycle bike) {
        if (bike.type.equalsIgnoreCase("road")) {
            System.out.println("Try a longer road ride at 15-20 MPH for endurance.");
        } else if (bike.type.equalsIgnoreCase("mountain")) {
            System.out.println("Hit the trails and focus on hill climbs.");
        } else if (bike.type.equalsIgnoreCase("hybrid")) {
            System.out.println("Mix up road and trail rides to keep it interesting.");
        } else {
            System.out.println("Enjoy relaxed rides to match your style!");
        }
        System.out.println("For your current speed of " + bike.speed + " MPH, aim to maintain a cadence of " 
                           + (bike.cadence + 10) + " RPM for a challenge.");
    }

    public static void createWorkoutPlan(Scanner input, Bicycle bike) {
        System.out.println("\n--- Create Your Custom Workout Plan ---");
        System.out.print("Enter your target duration (in minutes): ");
        int duration = input.nextInt();

        String terrain;
        if (bike.type.equalsIgnoreCase("road")) {
            terrain = "smooth paved roads";
        } else if (bike.type.equalsIgnoreCase("mountain")) {
            terrain = "rugged trails with hills";
        } else if (bike.type.equalsIgnoreCase("hybrid")) {
            terrain = "a mix of paved roads and light trails";
        } else {
            terrain = "your favorite comfortable paths";
        }
        
        System.out.print("Enter your target speed (in MPH): ");
        int targetSpeed = input.nextInt();

        System.out.println("\n--- Your Custom Workout Plan ---");
        System.out.println("- Ride for " + duration + " minutes on " + terrain + " terrain.");
        System.out.println("- Maintain a speed of " + targetSpeed + " MPH.");
        System.out.println("- Stay consistent with your cadence to advance!");
    }
}

