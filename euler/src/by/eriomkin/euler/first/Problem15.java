package by.eriomkin.euler.first;

/*
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */

public class Problem15 {

	public static void main(String[] args) {

		int n = 20;
		int result = calculateNumberOfRoutes(n,n);
		
		System.out.println("number of routes: " + result);

	}

	
	// Calculate the quantity of routes in rectangle
	private static int calculateNumberOfRoutes(int n, int m) {
		int result = 0;

		if (m == 0 || n == 0) {
			return 1;
		}
		if (m == 1 || n == 1) {
			return n + m;
		}
		result = result + 2 * calculateNumberOfRoutes(n-1, m-1);
		result += calculateNumberOfRoutes(n, m-2);
		result += calculateNumberOfRoutes(n-2, m);
		return result;
	}
}
