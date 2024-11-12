package Week7;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayModApp {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        //  Input size of the array (up to 20 numbers)
        System.out.println("Enter the number of integers you would like (up to 20): ");
        int integers = userinput.nextInt();

        //  Validate the size
        while (integers < 1 || integers > 20) {
            System.out.println("Invalid input. Please enter a number between 1 and 20: ");
            integers = userinput.nextInt();
        }

        //  Create the array and input the numbers
        int[] numbers = new int[integers];
        System.out.println("Enter " + integers + " integers: ");
        for (int i = 0; i < integers; i++) {
            numbers[i] = userinput.nextInt();
        }

        //  Allow the user to edit the array
        boolean editing = true;
        while (editing) {
            System.out.println("Current array: " + Arrays.toString(numbers));
            System.out.print("Would you like to edit a number? yes/no: ");
            String response = userinput.next();

            //  Handle editing or cancellation based on the user’s response
            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter the index of the number you'd like to change (0 to " + (integers - 1) + "): ");
                int index = userinput.nextInt();

                //  Check index
                while (index < 0 || index >= integers) {
                    System.out.print("Invalid index. Please enter a valid index (0 to " + (integers - 1) + "): ");
                    index = userinput.nextInt();
                }

                //  Update the number at user's chosen index
                System.out.print("Enter the new number: ");
                numbers[index] = userinput.nextInt();

            } else if (response.equalsIgnoreCase("no")) {
                editing = false;  // Exit the loop if the user doesn't want to edit anymore
            } else {
                System.out.println("Invalid response. Please type 'yes' or 'no'.");
            }
        }

        //  Sort the array in ascending order
        Arrays.sort(numbers);

        //  Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
