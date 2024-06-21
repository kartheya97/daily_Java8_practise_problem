package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringProcessorDescending {

	/*
	 *  Create a method List<String> processStrings(List<String> strings) that takes a list of strings as input.
	 *  The method should return a list of strings that are converted to uppercase, filtered by length>4, 
	 *  and sorted in descending order of their lengths.
	 */

	public List<String> processStrings(List<String> list){

		/*
		 * Time  Complexity  = O(NLogN)
		 * Space Complexity  = O(1)
		 */

		//Comparator<String> descendingOrder = (entry1,entry2) -> Integer.compare(entry2.length(), entry1.length());
		return 	list.stream()
					.map(String::toUpperCase)
					.filter( str -> str.length() > 4 )
					.sorted(Comparator.comparingInt(String::length).reversed())
					.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList(
				"apple", 
				"banana", 
				"kiwi", 
				"fig", 
				"grape", 
				"orange", 
				"plum", 
				"pear"
				);
		StringProcessorDescending obj = new StringProcessorDescending();
		System.out.println(obj.processStrings(strings));		
	}

}
