/**
 * 
 */
package by.eriomkin.euler.first;

/**
 * @author 
 *Find the difference between the sum of the squares of the first one hundred 
 * natural numbers and the square of the sum.
 */
public class EulerTask6 {

	public static void main(String[] args) {
		
		int squareOfTheSum;
		int sumOfTheSquare;
		
		squareOfTheSum = 0;
		sumOfTheSquare = 0;
		
		for (int i = 1; i <= 100; i++) {
			squareOfTheSum += i;
			sumOfTheSquare += i*i;
		}
				
		squareOfTheSum *= squareOfTheSum;
				
		System.out.println(sumOfTheSquare);
		System.out.println(squareOfTheSum);
		
		System.out.println(squareOfTheSum - sumOfTheSquare);

	}

}
