/**
 * Even Fibonacci numbers
 * https://projecteuler.net/problem=3
 */
/* 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 */
package level1;

public class Problem002 {
	
	private static int RANGE = 4000000;
	private static int ANSWER = 0;
	
	public static void main(String[] args) {
		fibonacci(1, 1);
		System.out.println("Answer: " + ANSWER);
	} 
	
	public static void fibonacci(int m, int n) {
		if(n % 2 == 0) {
			System.out.println(n);
			ANSWER += n;
		}
		if(n < RANGE) {
			fibonacci(n, n + m);	
		}
	}

}