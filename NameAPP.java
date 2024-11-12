package helloWorld.Week2;

import java.util.Scanner;

public class NameAPP {
	
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {

		
		System.out.println("Enter your first name:");
		String first = userinput.nextLine();
		System.out.println("Enter your last name:");
		String last = userinput.nextLine();
		System.out.println("Enter your age:");
		Integer age = userinput.nextInt();
		System.out.println("Enter your average hours of sleep in a day:");
		double sleep = userinput.nextDouble();
		
		sleep = Math.round(sleep * 10)/10.0;
		
		System.out.println("\n--- Information ---");
		System.out.format("First name: %s\n", first);
		System.out.format("Last name: %s\n", last);
		System.out.format("Age: %d years\n", age);
		System.out.format("Average sleep: %.1f hours per day\n", sleep);
	}

}
