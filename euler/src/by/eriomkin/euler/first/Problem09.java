package by.eriomkin.euler.first;

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class Problem09 {

	public static void main(String[] args) {

		int a, b, c;
		a = 0;
		b = 0;
		c = 0;

		first: for (a = 1; a < 332; a++) {
			for (b = a + 1; b < (999 - a) / 2; b++) {
				for (c = b + 1; c <= 1000 - a - b; c++) {
					if ((a * a + b * b - c * c) == 0 && (a + b + c) == 1000) {
						break first;
					}
				}
			}
		}

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("a*b*c = " + a * b * c);

	}
}
