package Week8;
import java.util.Scanner;
import java.util.ArrayList;
public class listApp {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		ArrayList<Object> itemList = new ArrayList<>();
		boolean done = false;
		
		System.out.println("List Builder");
		
		while (!done) {
			System.out.println("\n Current List: " + itemList);
			System.out.println("---Choose an Option---");
			System.out.println("[1] Add an Item");
			System.out.println("[2] Remove an Item");
			System.out.println("[3] Edit an Item");
			System.out.println("[4] Exit Program");
			int choice = userinput.nextInt();
			userinput.nextLine();
			
			switch (choice) {
            case 1:
                System.out.println("Enter an item (it can be an integer, decimal, character, or string):");
                String input = userinput.nextLine();
                if (input.matches("-?\\d+")) {
                    itemList.add(Integer.parseInt(input)); // Integer
                } else if (input.matches("-?\\d*\\.\\d+")) {
                    itemList.add(Double.parseDouble(input)); // Decimal
                } else if (input.length() == 1) {
                    itemList.add(input.charAt(0)); // Character
                } else {
                    itemList.add(input); // String
                }
                break;

            case 2:
                System.out.println("Enter the index of the item to remove:");
                int removeIndex = userinput.nextInt();
                if (removeIndex >= 0 && removeIndex < itemList.size()) {
                    itemList.remove(removeIndex);
                } else {
                    System.out.println("Invalid index.");
                }
                break;

            case 3:
                System.out.println("Enter the index of the item to edit:");
                int editIndex = userinput.nextInt();
                userinput.nextLine();
                if (editIndex >= 0 && editIndex < itemList.size()) {
                    System.out.println("Enter the new value:");
                    String newValue = userinput.nextLine();
                    if (newValue.matches("-?\\d+")) {
                        itemList.set(editIndex, Integer.parseInt(newValue)); // Integer
                    } else if (newValue.matches("-?\\d*\\.\\d+")) {
                        itemList.set(editIndex, Double.parseDouble(newValue)); // Decimal
                    } else if (newValue.length() == 1) {
                        itemList.set(editIndex, newValue.charAt(0)); // Character
                    } else {
                        itemList.set(editIndex, newValue); // String
                    }
                } else {
                    System.out.println("Invalid index.");
                }
                break;

            case 4:
                done = true;
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    System.out.println("Final List: " + itemList);
    System.out.println("Program ended");
    userinput.close();
}
}