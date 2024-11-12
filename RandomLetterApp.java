package Week6;

public class RandomLetterApp {

    public static String generateRandomWord() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < 10; i++) {

            int randomIndex = (int) (Math.random() * alphabet.length());
            word.append(alphabet.charAt(randomIndex));
        }
        return word.toString();
    }

    public static String changeRandomLetter(String word) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] wordArray = word.toCharArray();
        
        int indexToChange = (int) (Math.random() * 10);

        int randomIndex = (int) (Math.random() * alphabet.length());
        char newLetter = alphabet.charAt(randomIndex);
        
        wordArray[indexToChange] = newLetter;
        
        return new String(wordArray);
    }

    public static void main(String[] args) {

        String currentWord = generateRandomWord();
        System.out.println("Word #1: " + currentWord);

        for (int i = 2; i <= 20; i++) {
            currentWord = changeRandomLetter(currentWord);
            System.out.println("Word #" + i + ": " + currentWord);
        }
    }
}
