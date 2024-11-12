package helloWorld.Week3;
import java.util.Scanner;

public class CalculatorAPP {

	    public static void main(String[] args) {
	        try (// Create a Scanner object for input
			var input = new Scanner(System.in)) {
				{
 
					 System.out.print("Enter the first decimal number (x > 1): ");
				     double x = input.nextDouble();
				     System.out.print("Enter the second decimal number (x > 1): ");
				     double y = input.nextDouble();
				     
				     double sum = x + y;
				     double multiplied = x * y;
				     double divided = x/y;
				     double power = Math.pow (x, y);
				     double log = Math.log(x) / Math.log(y);
				    		
				     
				     System.out.println("The quantity x + y = " + sum);
				     System.out.println("The quantity x * y = " + multiplied);
				     System.out.println("The quantity x/y = " + divided);
				     System.out.println("The quantity x^y = " + power);
				     System.out.println("The quantity log y (x) = " + log);
    }
			}
	 }
}