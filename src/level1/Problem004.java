/**
 * Largest palindrome product
 * https://projecteuler.net/problem=4
 */
/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
package level1;

public class Problem004 {

	public static void main(String[] args) {

		int answer = 0;
		
		for(int number1 = 100; number1 < 1000; number1++) {
			for(int number2 = 100; number2 < 1000; number2++) {
				int product = number1 * number2;
				if (product > answer) {
					if(isPalindrome(product)) {
						answer = product;
					}
				}
				
			}
		}
		
		System.out.println("Answer: " + answer);
	}
	
	public static boolean isPalindrome(int n) {
		boolean p = true;
		String numberAsString = Integer.toString(n);
		int len = numberAsString.length();
		int i = 0;
		int j = len -1;
	    while(i < j) {
	    	if(numberAsString.charAt(i++) != numberAsString.charAt(j--)) {
	    		p = false;
	    	}
	    }
		return p;
	}

}
