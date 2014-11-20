package jLoops;
import java.util.Scanner;
/**
 * Given two integers between 33 and 126 inclusive, this code will display the ascii symbols from the smaller to the 
 * larger integer 
 */

public class asciiSymbol {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); // setting up scanner as input 
		System.out.println ("Your numbers must be between 33 and 126 inclusive: ");
		System.out.println ("Enter first number: "); // first number 
		int num1 = input.nextInt();
		System.out.println ("Enter second number"); // second number
		int num2 = input.nextInt();
		while ((num1 < 33 || num1 > 126) || (num2 < 33 || num2 > 126) || (num1==num2)) { 
			/* if either of the numbers fall out of the range, it will 
			 * continually print "invalid input" until the user inputs
			 * a correct input
			 */
			System.out.println ("Invalid input");
			System.out.println ("Enter  number 1: "); //re-input first number 
			num1 = input.nextInt();
			System.out.println ("Enter number 2: "); // re-input second number 
			num2 = input.nextInt();
		}
		int larger_num, smaller_num; // declare as variables outside if/else condition
									//	to be used later in for loop - if used inside the loop,
									// 	it will not register as a declared variable 
		if (num1 > num2) { // if num1 is larger, it is assigned to larger_num
			larger_num = num1; 
			smaller_num = num2;  // num2 is smaller, so it is assigned smaller_num
		}
		else { // if num2 is larger, it is assigned to larger_num
			larger_num = num2;
			smaller_num = num1; // num1 is smaller so it is assigned smaller_num
		}
		System.out.println ("Your ASCII sub-table is");
		for (int i = 0; i < 20; i++) { // set up loop for * symbol repetition
			System.out.print ("*");
		}
		System.out.println (); // print new line for table 
		int count = 0; // this will count the number of spaces in a given line
		for (int x = smaller_num; x <= larger_num; x++) {
			char char_value = (char) x; 
			System.out.print (char_value + " ");
			count++; // increment the count of spaces to keep track of length
			if (count % 20 == 0) { // print new line every 20 spaces
				System.out.println ();
			}
		}	
		
	}
}
