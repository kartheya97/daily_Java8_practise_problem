package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private String department;
	private double salary;

	// Constructors, getters, and setters
	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
	}
}


public class HighestPaidEmployeesInEachDepartment {

	/*
	 * Create a method Map<String, Optional<Employee>> highestPaidEmployeeByDepartment(List<Employee> employees)
	 * that takes a list of employees as input.
	 * 
	 * The method should return a map where the keys are the department names and the values are the employees
	 * with the highest salary in each department.
	 */


	public static Map<String, Optional<Employee>> highestPaidEmployeeByDepartment(List<Employee> employees){

		    /*
		     * Time Complexity  : O(N)
		     * Space Complexity : O(1) Not considering the output map.
		     */
            Map< String, Optional<Employee> >	result = employees.stream()
            												   .collect(Collectors.groupingBy(
            														   							Employee::getDepartment, 
            														   							Collectors.maxBy(Comparator.comparing(Employee::getSalary))
            														   ));
            return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(highestPaidEmployeeByDepartment(getEmployees()));

	}

	public static List<Employee> getEmployees() {
		return Arrays.asList(
				new Employee("Alice", "HR", 70000),
				new Employee("Bob", "Engineering", 90000),
				new Employee("Charlie", "HR", 80000),
				new Employee("David", "Engineering", 120000),
				new Employee("Eva", "Finance", 110000),
				new Employee("Frank", "Finance", 95000),
				new Employee("Grace", "Engineering", 100000),
				new Employee("Hannah", "HR", 60000),
				new Employee("Ivy", "Finance", 105000),
				new Employee("Jack", "Engineering", 115000)
				);
	}

}
