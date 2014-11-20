
package jLoops;
/**
 * 
 * Prints out four perfect squares from 0 to 10,000
 *
 */
public class perfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum = 0; // declare summation variable 
	for (int num = 1; num < 10000; num++) { // outer loop for potential perfect numbers
		for (int div = 1; div < num; div++) { // inner loop for divisors 
			int y = num % div;
			if (y == 0) { // ie. if the number is divisible by the dividend 
				sum = sum + div; // this will keep track of whether sum of divisors is equal to num
			}
		}
		if (sum == num) { // sum of divisors = num, which is a perfect number
			System.out.println (num + " is a perfect number");
		}
		sum = 0; // reset sum if num is not perfect
	}
	}

}
