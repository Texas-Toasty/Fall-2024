package Week4;

import java.util.Scanner;

public class EncouragementApp {
    
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Ask for age
        System.out.println("How old are you?");
        int age = userinput.nextInt();
        userinput.nextLine(); 
        
        // Ask how they are doing
        System.out.println("How are you doing today?");
        String response = userinput.nextLine().toLowerCase(); 
        
        // Age-based messages
        if (age < 15) {
            System.out.println("Hey, you're doing great! Keep it up.");
        } else if (age < 30) {
            System.out.println("I'm proud of you, take one step at a time.");
        } else if (age < 100) {
            System.out.println("You've worked hard, take a little break to enjoy life.");
        } else {
            System.out.println("You're a true legend! Keep inspiring others.");
        }
        
        // Response-based messages
        if (response==("good")) {
            System.out.println("I'm happy to hear that! Keep going.");
        } else if (response==("bad")) {
            System.out.println("I'm sorry to hear that, just take one step at a time and trust things will get better.");
        } else {
            System.out.println("Thank you for sharing how you're feeling today.");
        }
    }
}
