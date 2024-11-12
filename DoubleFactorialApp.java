package Week11;

import java.util.Scanner;

public class DoubleFactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = getValidInput(scanner);
        
        System.out.println("The double factorial of " + value + " is: " + doubleFactorial(value));
        
        scanner.close();
    }
    
    // Recursive method to calculate the double factorial
    private static int doubleFactorial(int value) {
        System.out.println("Calculating: " + value + "!!");
        
        if (value <= 1) {
            return 1;
        }
        
        return value * doubleFactorial(value - 2); // Add the double jumps
    }
    
    // Method to validate user input
    private static int getValidInput(Scanner scanner) {
        int number = -1;
        
        while (true) {
            System.out.print("Enter a positive integer less than 20: ");
            
            try {
                number = Integer.parseInt(scanner.nextLine());
                
                // Check that the number is within the required range
                if (number > 0 && number < 20) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer less than 20.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        return number;
    }
}
