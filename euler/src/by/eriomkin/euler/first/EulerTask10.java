package by.eriomkin.euler.first;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. 
 * Find the sum of all the primes below two million.
 */

public class EulerTask10 {

	public static void main(String[] args) {
		long result;
		result = 0;
		
		for (int i = 1; i <= 2000000; i++) {
			if (isPrime(i)) {
				result += i;
				System.out.println( "i = " + i + ", result = " + result);
			}
		}
		

	}
	
	private static boolean isPrime(int number) {

		if (number == 1) {
			return false;
		} else if (number < 4) {
			return true;
		} else if (number % 2 == 0) {
			return false;
		} else if (number < 9) {
			return true;
		} else if (number % 3 == 0) {
			return false;
		} else {
			int r = (int) Math.sqrt(number);
			int f = 5;
			while (f <= r) {
				if ( number % f == 0) {f+= 6; return false;}
				if ( number % (f+2) == 0) {f+= 6; return false;} 
				f+= 6;
			}
		}

			return true;
	}

}
