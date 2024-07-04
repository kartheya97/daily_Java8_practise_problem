package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByParity {

	public static List<Integer> getSampleNumbers() {
		return Arrays.asList(10, 15, 8, 23, 42, 4, 17, 9, 30, 25);
	}

	public static void main(String[] args) {
		// Placeholder for your method implementation
		Map<String, List<Integer>> partionedNumbers = partitionByParity(getSampleNumbers());
		System.out.println(partionedNumbers);
		// Expected output: {even=[10, 8, 42, 4, 30], odd=[15, 23, 17, 9, 25]}
	}

	// Placeholder for the method you need to implement
	public static Map<String, List<Integer>> partitionByParity(List<Integer> numbers) {
		// Your implementation goes here

		/*
		 * Time Complexity = O(N)
		 */
		Map<Boolean, List<Integer>> partionedMap = numbers.stream()
				.collect(Collectors.partitioningBy(number -> number%2 == 0));
		Map<String, List<Integer>> output = Map.of(
				"even", partionedMap.get(true),
				"odd" , partionedMap.get(false)
				);
        return output;
        
	}
}
