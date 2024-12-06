package Week12;

import java.util.Scanner;

public class PersonTasksApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Collect input for the person's details
        System.out.print("Enter your person's first name: ");
        String firstName = userInput.nextLine();

        System.out.print("Enter your person's last name: ");
        String lastName = userInput.nextLine();

        System.out.print("Enter your person's gender: ");
        String gender = userInput.nextLine();

        System.out.print("Enter your person's age: ");
        int age = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Enter your person's weight (in pounds): ");
        double weight = userInput.nextDouble();
        userInput.nextLine();

        System.out.print("Enter your person's height (in feet): ");
        double height = userInput.nextDouble();
        userInput.nextLine();

        System.out.print("Enter your person's ethnicity: ");
        String ethnicGroup = userInput.nextLine();

        System.out.print("Enter your person's religion: ");
        String religion = userInput.nextLine();

        // Create a new Person
        Person p1 = new Person(firstName, lastName, gender, age, weight, height, ethnicGroup, religion);

        // User menu
        int choice;
        do {
            System.out.println("\nWhat would you like " + p1.getName() + " to do?");
            System.out.println("1. Say a greeting");
            System.out.println("2. Say a prayer");
            System.out.println("3. Take a nap");
            System.out.println("4. Eat something");
            System.out.println("5. Print full name");
            System.out.println("6. Change religion");
            System.out.println("7. Display all information");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice) {
                case 1 -> p1.sayGreeting();
                case 2 -> p1.sayPrayer();
                case 3 -> p1.takeNap();
                case 4 -> p1.eatSomething();
                case 5 -> System.out.println("Full Name: " + p1.getName());
                case 6 -> {
                    System.out.print("Enter the new religion: ");
                    String newReligion = userInput.nextLine();
                    p1.setReligion(newReligion);
                }
                case 7 -> System.out.println(p1);
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        userInput.close();
    }
}

