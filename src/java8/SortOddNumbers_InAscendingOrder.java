package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortOddNumbers_InAscendingOrder {
/*
 * Requirement: Create a method List<Integer> processNumbers(List<Integer> numbers) 
 * 				that takes this list of integers 
 * 				as input and returns a list of odd numbers sorted in ascending order.
 */
	public static List<Integer> sortOddNumbers(List<Integer> numbers ){
		/*
		 * Time  Complexity : O(NlogN)
		 * Space Complexity : O(1)
		 */
		 Comparator<Integer> ascComparator = (entry1,entry2) ->entry1.compareTo(entry2);
		 return numbers.stream()
		      	.filter( number -> number%2 != 0 )
		      	.sorted(ascComparator)
		      	.collect(Collectors.toList());
		 
		 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 15, 8, 23, 42, 4, 17, 9, 30, 25);
		System.out.println(sortOddNumbers(numbers));
	}

}
