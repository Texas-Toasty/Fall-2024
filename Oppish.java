package Week6;
import java.util.Scanner;

public class Oppish {

    public static boolean isVowel(char c) {
        return "aeiouy".indexOf(Character.toLowerCase(c)) != -1;
    }

    public static void translateToOppish(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '_') {
                System.out.print("_");
            } else if (!isVowel(currentChar)) {
                if (i == s.length() - 1 || s.charAt(i + 1) == '_') {
                    System.out.print(currentChar); // No "opp" if it's the last consonant of a word
                } else {
                    System.out.print(currentChar + "opp");
                }
            } else {
                System.out.print(currentChar);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an English sentence (use underscores for spaces): ");
        translateToOppish(scanner.nextLine());
        scanner.close();
    }
}
