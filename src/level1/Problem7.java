/**
 * 10001st prime
 * https://projecteuler.net/problem=7
 */
/* 
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10001st prime number?
*/
package level1;

public class Problem7 {
	
	private static int N = 10001;
	
	public static void main(String[] args) {
		long answer = 2;
		int i = 1;
		while(i <= N) {
			if(isPrime(++answer)) {
				++i;
			}
		}
		System.out.println("Answer: " + answer);
	}

	private static boolean isPrime(long number) {
		for(int i = 2; i < number / 2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
