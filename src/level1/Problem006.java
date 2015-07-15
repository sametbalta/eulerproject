/**
 * Sum square difference
 * https://projecteuler.net/problem=6
 */
/* 
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
package level1;

public class Problem006 {
	
	private static int RANGE = 100;
	
	public static void main(String[] args) {
	
		long sumOfSquares = 0;
		long squareOfSum = 0;
		
		for(int i = 0; i <= RANGE; i++) {
			sumOfSquares += i*i;
			squareOfSum += i;
		}
		
		long answer = squareOfSum*squareOfSum - sumOfSquares;
		
		System.out.println("Answer: " + answer);
	}

}
