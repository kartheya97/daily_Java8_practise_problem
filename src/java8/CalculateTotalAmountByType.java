package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction1 {
	private int id;
	private String type;
	private double amount;

	// Constructors, getters, and setters
	public Transaction1(int id, String type, double amount) {
		this.id = id;
		this.type = type;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Transaction{id=" + id + ", type='" + type + "', amount=" + amount + "}";
	}
}


public class CalculateTotalAmountByType {

	//Expected Output : {Food=30.75, Transport=23.25, Entertainment=35.00, Utilities=50.00}
	public static List<Transaction1> getSampleTransactions() {
		return Arrays.asList(
				new Transaction1(1, "Food", 10.50),
				new Transaction1(2, "Transport", 15.75),
				new Transaction1(3, "Food", 8.25),
				new Transaction1(4, "Entertainment", 20.00),
				new Transaction1(5, "Food", 12.00),
				new Transaction1(6, "Transport", 7.50),
				new Transaction1(7, "Utilities", 50.00),
				new Transaction1(8, "Entertainment", 15.00)
				);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   // Time Complexity : O(N)	
	   List<Transaction1> list = getSampleTransactions();
	   Map<String, Double> map = list.stream()
	       .collect(Collectors.groupingBy(Transaction1 :: getType,Collectors.summingDouble(Transaction1 :: getAmount)));
	   System.out.println(map);
	      
	   
	}

}
