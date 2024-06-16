package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    // Constructors, getters, and setters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

/*
 * Requirements:
 * 
 *  Create a method List<String> processPersons(List<Person> persons) that takes a list of persons as input.
 *  
 *  The method should return a list of names of persons who are 18 years or older, sorted by age in ascending order.
 *  
 */
public class SortPerson_Age_GreaterThan18_ASC {
	
	public static List<Person> getPersons() {
        return Arrays.asList(
                new Person("Alice", 22),
                new Person("Bob", 17),
                new Person("Charlie", 19),
                new Person("David", 15),
                new Person("Eva", 20),
                new Person("Frank", 18),
                new Person("Grace", 21),
                new Person("Hannah", 16)
        );
    }
	
	public static List<String> processPersons(List<Person> persons){
		
		/*
		 * Time Complexity of this approach is O(NlogN)
		 * Space Complexity is O(1)
		 */
		Comparator<Person> ascComprator = (person1, person2) -> Integer.compare(person1.getAge(), person2.getAge());
		return persons.stream()
				      .filter(person -> person.getAge() >= 18)
				      .sorted(ascComprator)
				      .map(person -> person.getName())
				      .collect(Collectors.toList());
				      
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> personNames = processPersons(getPersons());
		System.out.println(personNames);
		
	}

}
