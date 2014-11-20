package jLoops;
import java.util.Scanner;
/**
 * Given an input integer n, this code will print a multiplication table up to and including n
 * 
 */
public class multTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
	System.out.println ("Input number between 1 and 20: ");
	int num = input.nextInt();
	while (num < 1 || num > 20) { // set up loop for invalid inputs
		System.out.println ("Invalid input");
		System.out.println ("Please enter a number between 1 and 20: ");
		num = input.nextInt(); // update condition
	}
	System.out.println ("Multiplication table for " + num);
	System.out.print ("\t");
	for (int i = 1; i <= num; i++) {
		System.out.print (i + "\t");	
	}
	System.out.println (); // print new line
	for (int symbol = 0; symbol <= num*8; symbol++) { // formatting for * symbol, 165 is arbitrary
		System.out.print ("*");
	}
	System.out.println(); // print new line
	for (int x = 1; x <=num; x++) { //set up columns
		System.out.print (x + "  |  ");	// formatting of numbers in column
		for (int y = 1; y <= num; y++) {	// set up rows
			System.out.print ("\t" + x * y);	// multiply column * row to get product
		}
		System.out.println();	// print new line after each iteration of the outer loop
		}
	}
	
	}


