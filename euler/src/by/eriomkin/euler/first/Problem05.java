package by.eriomkin.euler.first;

/*
 * 2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder. What is the smallest positive number that 
 * is evenly divisible by all of the numbers from 1 to 20? 
 * */
public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,2,5,19,3,3,17,2,2,13,11,7};
		long result;
		
		result = 1L;
		
		for (int i = 0; i < arr.length; i++) {
			result*=arr[i];
		}
		
		System.out.println(result);

	}
	
	

}
