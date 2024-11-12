package Week4;

import java.util.Scanner;

public class letterGradesAPP {
    
    static Scanner userinput = new Scanner(System.in); 

    public static void main(String[] args) {
        
        System.out.println("Enter a test score: ");
        int testscore = userinput.nextInt();
        
        int ascii = 74 - (testscore / 10);  
        if (ascii > 68) {  
            ascii = 70;
        }

        String grade = String.valueOf((char) ascii);  

        if (testscore >= 60 && testscore <= 100) {
            int lastDigit = testscore % 10;
        
        

            if (lastDigit >= 7 && testscore != 100) {
                grade += "+";
            } else if (lastDigit <= 2) {
                grade += "-";
                if (testscore == 100) {
                	grade = "A+";
                }
            }
        }

        System.out.println("Grade: " + grade);
    }
}
