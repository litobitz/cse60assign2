package cse360assign2;

/** 
 * @author Adilene Chavez
 * Class ID: 302
 * Assignment 02
 * Description: This is a simple list that has five methods that you 
 * 				can use to modify an array.
 */
public class SimpleList {
	
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
	SimpleList() {
		list = new int[10];
		count = 0;
	}

	/**
	 * Adds a new element to the beginning of the array
	 * If the array is full, the last element "falls off"
	 * Otherwise each element is shifted before adding the new integer.
	 * @param newInt is the new element that the user is trying to add to the arrayy
	 */
	public void add(int newInt) {
		// Check if the list is empty, if so just add at index 0
		if (count == 0) {
			list[0] = newInt;
			count++; 		// Update count
		}
		// Check if the list is full, if not shift to the right
		// And the element to index 0
		else if(count < 10) {
			// Move the elements to the right 
			for (int index = count-1; index >= 0; index--) {
				list[index + 1] = list[index];
			}
			list[0] = newInt;
			count++;
		}
		else {
			// Move the elements to the right 
			for (int index = count-2; index >= 0; index--) {
				list[index + 1] = list[index];
			}
			list[0] = newInt;
		}
	}
	
	/**
	 * Removes an element from the list by using the search method
	 * If the element is found, then we shift everything down starting at
	 * The index of the location.
	 * @param target is the element they are trying to remove
	 */
	public void remove(int target) {
		// Search the list for the target
		// If found, give the location of the list
		int location = search(target);
		
		// We found the target in the list
		if(location != -1) {
			for(int index = location; index < count; index++) {
				list[index] = list[index + 1];
			}
			count --; 	// Update count
		}
	}
	
	/**
	 * Count is a getter method for the global variable count 
	 * @return an integer that tells us how many elements are in the array
	 */
	public int count() {
		return count;
	}
	
	/**
	 * toString converts the array into a string for better display
	 * @return the String with all the arrays 
	 */
	public String toString() {
		// Empty string to hold the array
        String results = "";
        // Traverse through the array, adding each element to our new string
        for (int index = 0; index < count; index++) {
            results = results + list[index] + " ";
        }
        return results; 
	}
	
	/**
	 * Search looks for the element by traversing through the array
	 * If found, it returns the location of the target
	 * If not found, then it returns -1
	 * @param target is the element the user is trying to find
	 * @return an integer of the index where the target
	 */
	public int search(int target) {
		// Holds the index where the target is
		// -1 is the default means that the target is not in the list
		int location = -1;	
		
		// Traverse through the array trying to find the target
		for (int index = 0; index < list.length; index++) {
			// Found the target!
			if(list[index] == target) 
				location = index;		// Update our location 
		}
		return location;
	}
}
