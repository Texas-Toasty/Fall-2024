package Week7;
import java.util.Scanner;

public class Fibonacci_Sequence {
    static Scanner userinput = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Obtaining the length
        System.out.println("How many Fibonacci numbers would you like? (1-32) ");
        int num = userinput.nextInt();
        // Ruling out exceptions
        while(num > 32 || num < 1) {
            System.out.println("Invalid response, try again: ");
            num = userinput.nextInt();
        }
        // Create the array
        int[] fibonacciArray = new int[num];
        // Determining the first number
        if (num >= 1) {
            fibonacciArray[0] = 1;
        }
        if (num >= 2) {
            fibonacciArray[1] = 1; 
        }
        // Calculate the rest of the sequence
        for (int i = 2; i < num; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        // Printing the results
        System.out.println("The " + num + " Fibonacci numbers are: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
        System.out.println();
    }
}
