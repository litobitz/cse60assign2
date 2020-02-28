package cse360assign2;

/**
 * Class ID: 302
 * Assignment 02
 * Description: This is version number two of SimpleList with four new methods.
 * @author Adilene Chavez
 */
public class SimpleListVersionTwo {
	
	/**
	 * Global variables used throughout the program
	 */
	private int[] list;			// Array of Integers called List
	private int count;			// Keeps track of the number of elements in our array

	/**
	 * Constructor for Class
	 * List size is automatically set 10
	 * Count is initialized to 0
	 */
	SimpleListVersionTwo() {
		list = new int[10];
		count = 0;
	}
	
	/**
	 * Appends the new Integer to the last of the array list
	 * If the array is full, then we increase the size by 50%
	 * @param newInt the element they want to add to the array.
	 */
	public void append(int newInt) {
		// Check to see if the list is full
		if (count == list.length) {
		int size = count / 2;
		
		// A copy of the array
		int copyArray[] = new int[count + size];
		
		//Copying the old array into the new array
		for (int index = 0; index < (count + size); index++) {
			copyArray[index] = list[index];
		}
		
		list = copyArray; // Changing the reference from the copy to the new one
		
		// Changing count
		count = (size + count);
		
		// Now that we resized the array, we can add the element to index 0
		list[count] = newInt;
		count++;
		}
		// List is not full so add at the last element
		else {
			list[count] = newInt;
		}
	}
	
	/**
	 * Returns the first element in the list, if it is empty, it returns -1
	 * @return the first integer or -1
	 */
	public int first() {
		// if the list is empty then return -1
		if (count == 0)
			return -1;
		else 
			return list[0];
	}
	
	/**
	 * Returns the last element in the list, if it is empty, it returns -1
	 * @return the last integer or -1
	 */
	public int last() {
		// If the list is empty, then return -1
		if (count == 0) 
			return -1;
		else
			return list[count];
	}
	
	/**
	 * Returns the current number of possible locations of the array
	 * @return an integer with the size of the array
	 */
	public int size() {
		// Returns the length of the array
		return list.length;
	}
}
