package Week5;

import java.util.Scanner;

public class AdditionTableApp {
    
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number between 3 and 20: ");
        int n = userinput.nextInt();

        if (n < 3 || n > 20) {
            System.out.println("Please enter a valid number between 3 and 20.");
        } else {
            // Print the header row
            System.out.print("+ ");
            for (int i = 1; i <= n; i++) {
                System.out.printf("%4d", i);
            }
            System.out.println();

            for (int i = 1; i <= n; i++) {
                // Print the row header
                System.out.printf("%d ", i);

                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", i + j); 
                }
                System.out.println();
            }
        }
    }
}
