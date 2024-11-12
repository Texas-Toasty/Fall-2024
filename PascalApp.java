package Week7;
import java.util.Arrays;
public class PascalApp {

	public static void main(String[] args) {
		//  Create an 11x11 array to store Pascal's triangle
        int[][] pascal = new int[11][11];
        //  Initialize the triangle using 0s
        for (int[] row : pascal) {
            Arrays.fill(row, 0);
        }
        //  Compute the values
        for (int i = 0; i < 11; i++) {
            //  The first and last number in every row is 1
            pascal[i][0] = 1;
            
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }
        //  Printing
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}