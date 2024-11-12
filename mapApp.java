package Week8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapApp {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        //  Map of user names and passwords
        Map<String, String> userCredentials = new HashMap<>();
        userCredentials.put("rparry", "smokeythebear");
        userCredentials.put("tgnelson", "SnB8ky");
        userCredentials.put("rdokafor", "n!@hyj");
        userCredentials.put("jdoe", "jdoe2001");
        userCredentials.put("ksmith", "password");

        //  Map of user names and short messages
        Map<String, String> userMessages = new HashMap<>();
        userMessages.put("rparry", "Hi Reece. Remember to feed the dog.");
        userMessages.put("tgnelson", "What is up dog?");
        userMessages.put("rdokafor", "This is Jill. Are you coming to my birthday party?");
        userMessages.put("jdoe", "John, don't forget the meeting tomorrow at 10 AM.");
        userMessages.put("ksmith", "Kate, your package has arrived!");

        //  Login details
        System.out.print("Enter your username: ");
        String username = userinput.nextLine();
        
        System.out.print("Enter your password: ");
        String password = userinput.nextLine();

        //  Check if the user name exists and password matches
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            //  If correct, display the short message
            System.out.println("Login successful!");
            System.out.println("Your message: " + userMessages.get(username));
        } else {
            System.out.println("Incorrect username or password. Access denied.");
        }
        userinput.close();
    }
}
