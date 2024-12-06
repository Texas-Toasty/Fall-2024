package Week13;
import java.util.Scanner;

import Week4.EncouragementApp;
import helloWorld.Week1.Application;
import helloWorld.Week1.Art;
import helloWorld.Week3.BinaryCalculatorAPP;
// import helloWorld.Week3.CalculatorAPP;

public class UltimateComputerTextProcessing {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean keepRunning = true;

	        while (keepRunning) {
	            System.out.println("\n     Welcome to the Ultimate Computer!");
	            System.out.println("               Main Menu");
	            System.out.println("-".repeat(40));
	            System.out.println("1: Display a motivational message");
	            System.out.println("2: Show ASCII art");
	            System.out.println("3: Calculator");
	            System.out.println("4: Binary Calculator");
	            System.out.println("5: Encouragement");
	            System.out.println("6: Roll Dice");
	            System.out.println("7: Translate to Oppish");
	            System.out.println("8: Generate Fibonacci Sequence");
	            System.out.println("9: Calulate Double Factorial");
	            System.out.println("10: Exit");
	            System.out.print("Choose an option (1-10): ");

	            int choice = getValidChoice(scanner);

	            // Main menu selection logic
	            switch (choice) {
	                case 1 -> display(null);
	                case 2 -> art(null);
	                case 3 -> calculator(null);
	                case 4 -> binaryCalculator(null);
	                case 5 -> encouragement(null);
	                case 6 -> Dice(null);
	                case 7 -> runOppish(null);
	                case 8 -> fibonacci(null);
	                case 9 -> doubleFactorial(null);
	                case 10 -> {
	                    System.out.println("Exiting the program. Goodbye!");
	                    keepRunning = false;
	                }
	                default -> System.out.println("Invalid option, please try again.");
	            }
	        }
	        
	        scanner.close();
	    }
	    
	    // Method to get a valid integer choice from user input
	    private static int getValidChoice(Scanner scanner) {
	        while (true) {
	            try {
	                System.out.print("Enter a choice (1-10): ");
	                String input = scanner.nextLine();
	                int choice = Integer.parseInt(input.trim());
	                if (choice >= 1 && choice <= 10) {
	                    return choice; // Valid choice
	                } else {
	                    System.out.println("Please enter a valid option (1-10).");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a number between 1 and 10.");
	            }
	        }
	    }



	    // Placeholder methods for menu options (can be filled later)
	    public static void display(String[] args) {
	        System.out.println("Displaying a motivational message...");
	        Application.main(args);
	    }

	    public static void art(String[] args) {
	        System.out.println("Showing ASCII art...");
	        Art.main(args);
	    }

	    public static void calculator(String[] args) {
	        System.out.println("Opening calculator...");
	        // CalculatorAPP.main(args);
	    }

	    public static void binaryCalculator(String[] args) {
	        System.out.println("Opening binary calculator...");
	        BinaryCalculatorAPP.main(args);
	    }

	    public static void encouragement(String[] args) {
	        System.out.println("Providing encouragement...");
	        EncouragementApp.main(args);
	    }

	    public static void Dice(String[] args) {
	        System.out.println("Rolling dice...");
	        // TODO: Implement the dice rolling functionality
	    }

	    public static void runOppish(String[] args) {
	        System.out.println("Translating to Oppish...");
	        // TODO: Implement Oppish translation functionality
	    }

	    public static void fibonacci(String[] args) {
	        System.out.println("Generating Fibonacci sequence...");
	        // TODO: Implement Fibonacci sequence generation
	    }
	    public static void doubleFactorial(String[] args) {
	        System.out.println("Generating Fibonacci sequence...");
	        // TODO: Implement Double Factorial sequence generation
	    }
	}