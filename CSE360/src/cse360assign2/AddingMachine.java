package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	//Constructor class
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	//Returns current total
	public int getTotal () {
		return total;
	}
	
	//Adds value to total 
	public void add (int value) {
		total += value;
		history +=  " + " + value;
	}
	
	//Subtracts value from total
	public void subtract (int value) {
		total -= value;
		history += " - " + value ;
	}
		
	//Returns string containing history of operations performed
	public String toString () {
		return history;
	}

	//Resets total to 0
	public void clear() {
		total = 0;
	}
}
