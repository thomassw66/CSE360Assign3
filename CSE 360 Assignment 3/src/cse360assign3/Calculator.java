
package cse360assign3;

/**
 * Name: Thomas Wheeler
 * PIN: 905
 * 
 * A class to perform basic calculator applications.
 * 
 * @author Thomas Wheeler for CSE360 Spring 2016
 * @version February 22, 2016
 *
 */

public class Calculator {

	private int total;
	
	/**
	 * Instantiates a calculator object
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Getter method for the total result of operations performed
	 * 
	 * @return the current total value stored by the calculator
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Takes a value and adds it to the total
	 * 
	 * @param value		The integer value to be added to total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Takes a value and subtracts it from the total
	 * 
	 * @param value 	The integer value to be subracted from the total
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Takes a value and multiplies it with the total
	 * 
	 * @param value		The integer value to be multiplied with the total
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * Takes a value and divides the current total by it
	 * 
	 * @param value		The value to divide the total by
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * Generates a history of operations performed on the calculator and returns 
	 * it as a string
	 * 
	 * @return	A string history of operations performed
	 */
	public String getHistory () {
		return "";
	}
}