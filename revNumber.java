package jLoops;

import java.util.Scanner;
/**
 * Reverses a number by first separating and obtaining individual digits and printing out reverse form
 */
public class revNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in); // set up scanner 
	System.out.println ("Enter a number between 1 and 100");
	System.out.println ("The integer cannot end in 0");
	System.out.println ("Enter 0 if you want to exit");
	System.out.println ("Enter the number: "); // numerical input
	int num = input.nextInt();
	while (num != 0) { // set up while loop to distinguish 0 and any other number
		if (num % 10 == 0) { // if number ends in 0, it is an invalid input
			System.out.println ("Invalid input. The number ends in 0");
			System.out.println ("Enter 0 to exit");
			System.out.println ("Please enter a number between 1 and 100: ");
			num = input.nextInt(); // update condition of while loop
		}
		else if ((num < 100) && (num > 1)) { // number within correct range
			int dig_left = num / 10; // separate left digit
			int dig_right = num % 10; // separate right digit
			System.out.println ("You number is: " + num);
			System.out.println ("Your number reversed is: " + dig_right + dig_left);
			System.out.println ("Enter a number between 1 and 100 or 0 to exit: ");
			num = input.nextInt(); // update condition of while loop
		}
		else { // numbers less than 1 or greater than 100 
			System.out.println ("Invalid input");
			System.out.println ("Please enter a number between 1 and 100 or 0 to exit: ");
			num = input.nextInt(); // update condition of while loop
		}
	}
	if (num == 0) { // 0 is the sentinel value and breaks the loop
		System.out.println ("Goodbye");
	}
	
	}
}
	
	
	


