/**
 * Largest prime factor
 * https://projecteuler.net/problem=3
 */
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */
package level1;

public class Problem3 {

	private static long NUMBER = 600851475143L;
	
	public static void main(String[] args) {

		long answer = 0;
		long i = 2L;
		long d = NUMBER;
		while (d > 1) {
			if (NUMBER % i == 0) {
				d = NUMBER / i;
				System.out.println(NUMBER + " / " + i + " = " + d);
				NUMBER = d;
				answer = i;
			} else {
				i++;
			}
		}

		System.out.println("Answer: " + answer);
	}

}
