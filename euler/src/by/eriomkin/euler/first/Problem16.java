package by.eriomkin.euler.first;

/*
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
 */

public class Problem16 {

	public static void main(String[] args) {


		int[] arr;
		int temp1;
		int temp2;
		int temp3;
		int result;
		
		result = 0;
		temp1 = 0;
		temp2 = 0;
		temp3 = 0;
		arr = new int[500];
		arr[0] = 2;
		
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < arr.length; j++) {
				temp1 = arr[j];
				temp2 = temp1 * 2 + temp3;
				arr[j] = temp2 % 10;
				
				if (temp2 > 9) {
					temp3 = temp2/10;
				} else {
					temp3 = 0;
				}
			}
		}
		
		for (int digit : arr) {
			result += digit;
			System.out.print(digit);
		}
		System.out.println();
		System.out.println("result = " + result);

	}

}
