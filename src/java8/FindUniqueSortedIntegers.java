package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Create a method List<Integer> findUniqueSortedIntegers(List<Integer> numbers)
 * that takes a list of integers as input.
 * The method should return a list of unique integers sorted in ascending order.
 */
public class FindUniqueSortedIntegers {

    public static List<Integer> getSampleNumbers() {
        return Arrays.asList(5, 3, 8, 3, 1, 7, 8, 2, 5, 6, 2, 9, 0);
    }

    public static void main(String[] args) {
        // Placeholder for your method implementation
        List<Integer> uniqueSortedNumbers = findUniqueSortedIntegers(getSampleNumbers());
        System.out.println(uniqueSortedNumbers); // Expected output: [0, 1, 2, 3, 5, 6, 7, 8, 9]
    }

    // Placeholder for the method you need to implement
    public static List<Integer> findUniqueSortedIntegers(List<Integer> numbers) {
        /*
         * Time Complexity = O(NlogN), Space Complexity = O(1) as output array is not taken into consideration.
         */
    	return numbers.stream()
    			      .distinct()
    			      .sorted()
    			      .collect(Collectors.toList());
    	
    }
}
