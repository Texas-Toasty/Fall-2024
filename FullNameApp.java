package Week6;
import java.util.Scanner;

public class FullNameApp {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your first name: ");
		String first = userinput.nextLine();
		
		System.out.println("Enter your middle name: ");
		String middle = userinput.nextLine();
		
		System.out.println("Enter your last name: ");
		String last = userinput.nextLine();
		
		String full = first + " " + middle + " " + last;
		
		System.out.println(full);
	}

}
