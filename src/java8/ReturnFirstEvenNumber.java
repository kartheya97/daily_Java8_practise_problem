package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReturnFirstEvenNumber {

	/*
	 *  Create a method int findFirstEvenNumber(List<Integer> numbers) that takes a list of integers as input.
	 *  The method should return the first even number in the list or -1 if no even number is found.
	 */

	public static int findFirstEvenNumber(List<Integer> numbers) {
		/*
		 * Time  Complexity :O(N)
		 * Space Complexity :O(1)
		 */
		
		/*
			Optional<Integer> evenNumber = numbers.stream()
				                              .filter( number -> number%2 == 0)
				                              .findFirst();
			if(evenNumber.isPresent())
				return evenNumber.get();

			else
				return -1;
		 */	
		return numbers.stream()
					  .filter( number -> number%2 == 0)
					  .findFirst()
					  .orElse(-1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers1 = Arrays.asList(1, 3, 5, 7, 10, 12, 14);
		List<Integer> numbers2 = Arrays.asList(11, 13, 15, 17, 19);
		List<Integer> numbers3 = Arrays.asList(2, 4, 6, 8, 10);
		List<Integer> numbers4 = Arrays.asList();

		System.out.println(findFirstEvenNumber(numbers1)); // Expected output: 10
		System.out.println(findFirstEvenNumber(numbers2)); // Expected output: -1
		System.out.println(findFirstEvenNumber(numbers3)); // Expected output:  2
		System.out.println(findFirstEvenNumber(numbers4)); // Expected output: -1
	}

}
