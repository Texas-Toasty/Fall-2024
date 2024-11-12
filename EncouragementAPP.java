package helloWorld.Week2;

import java.util.Scanner;

public class EncouragementAPP {

	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		String f;
		String m;
		String l;
		
		System.out.println("Enter your first name:");
		f = userinput.nextLine();
		System.out.println("Enter your middle name:");
		m = userinput.nextLine();
		System.out.println("Enter your last name:");
		l = userinput.nextLine();
		
		System.out.println("Hello, " + f + " " + m + " " + l + "! Keep going, God will work it all for good!\u2764\uFE0F");
	}
}
