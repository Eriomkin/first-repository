package by.eriomkin.euler.first;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number? * 
 * */

public class EulerTask7 {

	public static void main(String[] args) {

		int num;
		int result;

		num = 0;

		for (int i = 2;; i++) {
			if (isPrimeNumber(i)) {
				num++;
				System.out.println("num = " + num + ", number = " + i);
			}
			if (num == 10001) {
				result = i;
				break;
			}

		}

		System.out.println("resuln = " + result);

	}

	static boolean isPrimeNumber(int number) {

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
			while (f < r) {
				if ( number % f == 0) {f+= 6; return false;}
				if ( number % (f+2) == 0) {f+= 6; return false;} 
				f+= 6;
			}
		}

			/*
			 * for (int i = 2; i < number; i++) { if(number % i == 0) { return false; } }
			 */
			return true;
	}

}
