package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Create a method List<Integer> processTransactions(List<Transaction> transactions, String type) 
 *  that takes a list of transactions and a transaction type as input.
 
   The method should return a list of transaction IDs that match the given type, sorted by the amount in descending order.
 */

class Transaction {
    private int id;
    private String type;
    private double amount;

    // Constructors, getters, and setters
    public Transaction(int id, String type, double amount) {
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


public class TransactionIds_In_DescendingOrder {

    public static List<Integer> processTransactions(List<Transaction> transactions, String type){
    
    	/*
    	 * Time   Complexity O(N LogN)
    	 * Space  Complexity O(1)
    	 */
      Comparator<Transaction> reverseAmount = (entry1, entry2) -> Double.compare(entry2.getAmount(),entry1.getAmount());
   
      return transactions.stream()
    		  .filter(transaction -> transaction.getType().equals(type))
    		  .sorted(reverseAmount)
    		  .map(transaction -> transaction.getId())
    		  .collect(Collectors.toList());
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Transaction> transactions = Arrays.asList(
	            new Transaction(1, "GROCERY", 50.5),
	            new Transaction(2, "ELECTRONICS", 200.0),
	            new Transaction(3, "GROCERY", 20.0),
	            new Transaction(4, "CLOTHING", 100.0),
	            new Transaction(5, "GROCERY", 70.0),
	            new Transaction(6, "ELECTRONICS", 150.0),
	            new Transaction(7, "GROCERY", 90.0)
	        );

	        // Use the processTransactions method with "GROCERY" as the type
	        List<Integer> result = processTransactions(transactions, "GROCERY");

	        // Print the result
	        System.out.println(result); // Expected output: [7, 5, 1, 3]
		
	}

}
