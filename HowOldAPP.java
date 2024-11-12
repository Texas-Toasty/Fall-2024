package helloWorld.Week3;

import java.util.Scanner;

public class HowOldAPP {

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args)

    {

                int s;

                System.out.print("How old are you?");

                s = userinput.nextInt();

                int futureAge = s + 5;

                System.out.println("In 5 years you will be " + futureAge + " years old.");
                
                boolean isTeen = (s < 20) && (s > 12);

                System.out.println("It is " + isTeen + " that you are a teenager");

                System.out.println("I am such a smart computer.");

    }

}
