/**
 * Smallest multiple
 * https://projecteuler.net/problem=5
 */
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package page1;

public class Problem5 {

	public static void main(String[] args) {
		long answer = 2520 * 11 * 13 * 17 * 19;
		while(!check(answer++));
		--answer;
		System.out.println("Answer: " + answer);
	}
	
	public static boolean check(long n) {
		for(int i = 20; i > 10; i--) {
			if(n % i != 0) {
				return false;
			}
		}
		return true;
	}
}
