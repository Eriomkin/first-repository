package by.eriomkin.euler.first;



public class Problem03 {

	public static void main(String[] args) {

		long number;
		long largestPrimeFactor;

		number = 600851475143L;

		largestPrimeFactor = 1;

		while (largestPrimeFactor < number) {
			if (number % largestPrimeFactor == 0) {
				if (isItPrimeFactor(largestPrimeFactor)) {
					System.out.println(largestPrimeFactor);

				}
			}
			largestPrimeFactor++;
		}

	}

	static boolean isItPrimeFactor(long number) {

		long factor;
		factor = number - 1;

		while (factor > 1) {
			if (number % factor == 0) {
				return false;
			}
			factor--;
		}
		return true;
	}

}
