package Week13;

import java.util.Scanner;

public class BicycleApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Bike Workout Planner!");

        // Create Bicycle objects based on user input
        System.out.print("Enter your name: ");
        String owner = input.nextLine();

        System.out.print("Enter the type of bike you own (road, mountain, hybrid): ");
        String type = input.nextLine();

        System.out.print("Enter your bike's gear: ");
        int gear = input.nextInt();

        System.out.print("Enter your bike's cadence (RPM): ");
        int cadence = input.nextInt();

        System.out.print("Enter your bike's current speed (MPH): ");
        int speed = input.nextInt();

        // Create a new Bicycle object
        Bicycle myBike = new Bicycle(cadence, speed, gear, type, owner);

        // Display the bike's information
        System.out.println("\n--- Bicycle Information ---");
        System.out.println(myBike.getInfo());

        // Workout suggestions based on speed and type
        System.out.println("\n--- Workout Suggestions ---");
        suggestWorkout(myBike);

        // User input for creating a workout plan
        System.out.println("\nWould you like to set up a custom workout plan? (yes/no)");
        input.nextLine();
        String response = input.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            createWorkoutPlan(input, myBike);
        } else {
            System.out.println("No problem! Enjoy your ride!");
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
        // Creating suggested terrain type based on bicycle
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
