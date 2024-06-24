package java8;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person1 {
    private String name;
    private LocalDate birthday;

    // Constructors, getters, and setters
    public Person1(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person1{name='" + name + "', birthday=" + birthday + "}";
    }
}

public class GroupPersonsByMonth {

	public static List<Person1> getSamplePersons() {
        return Arrays.asList(
            new Person1("Alice", LocalDate.of(1990, Month.JANUARY, 15)),
            new Person1("Bob", LocalDate.of(1985, Month.FEBRUARY, 20)),
            new Person1("Charlie", LocalDate.of(1992, Month.JANUARY, 10)),
            new Person1("David", LocalDate.of(1980, Month.MARCH, 5)),
            new Person1("Eva", LocalDate.of(1989, Month.APRIL, 25)),
            new Person1("Frank", LocalDate.of(1995, Month.FEBRUARY, 28)),
            new Person1("Grace", LocalDate.of(1987, Month.MARCH, 17)),
            new Person1("Hannah", LocalDate.of(1993, Month.APRIL, 1)),
            new Person1("Ivy", LocalDate.of(1991, Month.MAY, 30)),
            new Person1("Jack", LocalDate.of(1994, Month.MAY, 25))
        );
    }
	
	/*
	 *  Create a method Map<Month, List<Person1>> groupByBirthdayMonth(List<Person1> Person1s)
	 *  that takes a list of Person1s as input.
	 */
	public Map<Month, List<Person1>> groupByBirthdayMonth(List<Person1> Persons) {
		
		/*
		 * Time  Complexity : O(N)
		 * Space Complexity : O(1). as output map is not taken  into consideration
		 */
		Map<Month, List<Person1>> result = Persons.stream()
				                                 .collect(Collectors.groupingBy(
				                                		         person -> person.getBirthday()
				                                		         .getMonth()
				                                		  ));
		return result;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupPersonsByMonth obj = new GroupPersonsByMonth();
		System.out.println(obj.groupByBirthdayMonth(getSamplePersons()));		
		
	}

}
