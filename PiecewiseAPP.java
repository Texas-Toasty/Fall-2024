package Week4;

import java.util.Scanner;

public class PiecewiseAPP {
	
    static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter an integer x: ");
		int x = userinput.nextInt();
		
		 if (x < 0) { 
	            int f_x = 3 * x + 7;
	            System.out.println("f(x) = 3x + 7 = " + f_x);
	        } else if (0 <= x && x <= 10) {  
	            int f_x = x * x + 8; 
	            System.out.println("f(x) = x^2 + 8 = " + f_x);
	        } else if (x > 10) {  
	            int f_x = (int) (Math.pow(x, 3) - 6 * Math.pow(x, 2)); 
	            System.out.println("f(x) = x^3 - 6x^2 = " + f_x);
	        }
	    }
	}
