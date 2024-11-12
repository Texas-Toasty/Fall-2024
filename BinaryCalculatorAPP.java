package helloWorld.Week3;
import java.util.Scanner;
public class BinaryCalculatorAPP {
	
	static Scanner userinput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter your first binary number (up to 16 bits): ");
		String binaryX = userinput.nextLine();
		
		System.out.print("Enter your second binary number (up to 16 bits): ");
		String binaryY = userinput.nextLine();
		
		int x = Integer.parseInt(binaryX, 2);
		int y = Integer.parseInt(binaryY, 2);
		
		int sum = x + y;
		int difference = x - y;
		int product = x * y;
		int quotient = x/y;
		
		String sumBinary = Integer.toBinaryString(sum);
		String differenceBinary = Integer.toBinaryString(difference);
		String productBinary = Integer.toBinaryString(product);
		String quotientBinary = Integer.toBinaryString(quotient);
		
		System.out.println("The quantity x+y = " + sumBinary);
		System.out.println("The quantity x-y = " + differenceBinary);
		System.out.println("The quantity x*y = " + productBinary);
		System.out.println("The quantity x/y = " + quotientBinary);
		
	}

}
