package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_Of_Words_And_Its_Occurences {

	/*
	 *  Create a method Map<String, Long> countWordOccurrences(List<String> words) that 
	 *  takes a list of words as input.
	 *  The method should return a map with words as keys and their counts as values.
	 *  
	 *  Use Collectors and Streams
	 */

	public static Map<String,Long> countWordOccurences(List<String> words){

		/*
		 * Time  Complexity : O(N).
		 * Space Complexity : O(1) as output Map is not taken into consideration.
		 * 
		 * I have used the concept of groupingBy 
		 * So I have used groupingBy with two parameters
		 * First parameter is the classifier function and the second parameter is downstream collector which perform reduction operations.
		 */
		 Map<String, Long> map = words.stream()
				 					  .collect(Collectors.groupingBy(word->word, Collectors.counting()));
		 return map;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = Arrays.asList(
				"apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange", "grape", "banana"
				);
		System.out.println(returnWordsOccurence(words));


	}

}
