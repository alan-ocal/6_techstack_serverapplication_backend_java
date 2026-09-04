package com.student.collections_framework;

import java.util.Set;
import java.util.HashSet;

public class HashSetImpl {
	
    //using var
    //var cars = new HashSet<String> cars;
	// Create a HashSet that stores String objects
	private static HashSet<String> cars;
	
	// the variable (numbers) is declared as a Set (the interface),
	private static Set<Integer> numbers;
	
	public static void main(String[] args) {

		cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW"); // * 1- unique element - does not allow duplicates
		cars.add("Mazda");// * 2- unordered
		cars.add(null); // * 3- permits the null element.

		//numbers stores a HashSet object 
		numbers = new HashSet<Integer>();
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);

		/**
		 * Method 1- contains(Object o) - public boolean contains (Object o)
		 * 
		 * @param - o - element whose presence in this set is to be tested
		 * @return - true if this set contains the specified element
		 */

		boolean hasAudi = cars.contains("Audi");
		System.out.println(hasAudi); // false

		// calling
		HashSetImpl.carsContainsToyota(); // Toyota was not found
		HashSetImpl.numbersContains();	  // 4-- was found in the set. 7-- was found in the set. 	8-- was found in the set.

		/**
		 * Method 2- remove(Object o) - public boolean remove(Object o)
		 * 
		 * @param - o - object to be removed from this set, if present
		 * @return - true if the set contained the specified element
		 */
		boolean removeBMW = cars.remove("BMW");
		System.out.println(removeBMW); // true

		/**
		 * 
		 * Method 3- size() public int size()
		 * 
		 * @return - the number of elements in this set. Duplicate values are not
		 *         counted - only unique elements are included in the size.
		 */
		int sizeCars = cars.size(); // 4

		/**
		 * Method 5- forEach
		 * 
		 * for (T t : this) 
		 * action.accept(t);
		 * 
		 */
		for (String item : cars) {
			System.out.println(item);
		}

		/**
		 * Method 4- clear](Object o) public void clear()
		 */
		cars.clear();
		System.out.println(cars); // []

	}

	public static void carsContainsToyota() {
		if (cars.contains("Toyota")) {
			System.out.println("Toyota was found ");
		} else {

			System.out.println("Toyota was not found");
		}

	}

	public static void numbersContains() {

		for (int i = 1; i <= 10; i++) {
			if (numbers.contains(i)) {
				System.out.println(i + "-- was found in the set.");
			} else {
				System.out.println(i + " was not found in the set.");
			}
		}

	}
	

	

}

















































