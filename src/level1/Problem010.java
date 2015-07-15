/**
 * Summation of primes
 * https://projecteuler.net/problem=10
 */
/* 
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 */
package level1;

public class Problem010 {

	public static void main(String[] args) {
		long total = 0;
		for (int i = 2; i < 2000000; i++) {
			if (isPrime(i)) {
				total += i;
				System.out.println("prime is " + i + " total is " + total);
			}
		}
		System.out.println("Answer: " + total);
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number / 2 + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
