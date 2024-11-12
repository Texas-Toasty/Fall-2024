package Week5;

import java.util.Scanner;
import java.util.Random;

public class DiceApp {
    
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        String answer;
        Random random = new Random();  
        
        System.out.println("Would you like to roll two dice? [y] [n]");
        answer = userinput.nextLine();

        while (answer.equalsIgnoreCase("y")) { 
           
            int die1 = random.nextInt(6) + 1; 
            int die2 = random.nextInt(6) + 1;

            System.out.println("The result of the dice rolls: " + die1 + " and " + die2);
            System.out.println("Their sum is: " + (die1 + die2));
            
            System.out.println("Would you like to roll again? [y] [n]");
            answer = userinput.nextLine();
        }
        
        System.out.println("Thanks for playing!");
    }

}
