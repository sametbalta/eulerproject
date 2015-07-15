/**
 * Special Pythagorean triplet
 * https://projecteuler.net/problem=9
 */
/* 
 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */
package level1;

public class Problem009 {

	private static int TOTAL = 1000;

	public static void main(String[] args) {
		System.out.println("Answer: " + solve());
	}

	private static int solve() {
		int a;
		int b;
		int c;
		for (int i = 1; i < 999; i++) {
			for (int j = 1; j < 999; j++) {
				a = i;
				b = j;
				c = TOTAL - a - b;
				if ((a * a) + (b * b) == (c * c)) {
					System.out.println("Answer: a=" + a + ", b=" + b + ", c=" + c);
					return a * b * c;
				}
			}
		}
		return 0;
	}
	
}
