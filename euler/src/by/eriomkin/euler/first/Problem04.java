package by.eriomkin.euler.first;

/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem04 {

	public static void main(String[] args) {

		int number = 999998;

		for (int i = number; i > 100000; i--) {
			if (isItPalindrome(i)) {
				if (isItProductOf3DigitNumber(i)) {
					System.out.println(i);
					break;
				}
			}
		}

	}

	static boolean isItProductOf3DigitNumber(int number) {

		for (int i = 999; i > 100; i--) {
			if (number / i > 999) {
				break;
			}
			if (number % i == 0) {
				System.out.println(number / i + ", i =" + i);
				return true;
			}
		}
		return false;
	}

	static boolean isItPalindrome(int n) {
		char[] arr;
		String forward = "" + n;
		arr = forward.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[arr.length - i - 1]) {

			} else
				return false;
		}
		return true;
	}

}
