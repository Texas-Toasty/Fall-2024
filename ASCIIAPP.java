package helloWorld.Week2;

import java.util.Random;

public class ASCIIAPP {
	

	    public static void main(String[] args) {
	        // Create a random object to generate a random number
	        Random random = new Random();
	        
	        // Generate a random integer between 0 and 255
	        int number = random.nextInt(256);  // 256 because nextInt(256) generates a number from 0 to 255
	        
	        // Convert the number to binary, hexadecimal, and its ASCII character
	        String binary = Integer.toBinaryString(number);
	        String hexadecimal = Integer.toHexString(number);
	        char asciiCharacter = (char) number;
	        
	        // Output the information
	        System.out.println("Randomly chosen number: " + number);
	        System.out.println("Binary: " + binary);
	        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
	        System.out.println("ASCII character: " + asciiCharacter);
	    }
	}
