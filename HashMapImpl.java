package com.student.collections_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {

	private static HashMap<String, String> capitalCities;
	
	private static Map<String, Integer> people;

	public static void main(String[] args) {

		capitalCities = new HashMap<String, String>();
		people = new HashMap<String, Integer>();

		/** 
		 * add items
		 * Method 1- put() add key/value pairs 
		 * 				   for (Country, City) -
		 * 
		 * Note: the same key (like "Norway") is added more than once,
		 *       the latest value will overwrite the previous one, 
		 */

		capitalCities.put("England", "London");
		capitalCities.put("India", "New Dehli");
		capitalCities.put("Austria", "Wien");
		capitalCities.put("Norway", "Kattegat"); // Not printed
		capitalCities.put("Norway", "Oslo"); // 1- Duplicates allowed? (Keys: No; Values:Yes)
		capitalCities.put("USA", "Washington DC"); // 2- Stores key-value pairs? (Yes)
		System.out.println(capitalCities); // 3- Maintains order? (No)
		
		
		people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);
		
	    /**
		 * 
		 * Method 6- forEach
		 */
		for (String name : people.keySet()) {
			System.out.println("name: " + name + " age: " + people.get(name));
		}
		
		/**
		 * with java-8-functional-interface
		 * Method 7- forEach - public void forEach(BiConsumer action)
		 * @param action
		 */
		capitalCities.forEach((k,v) -> {System.out.println(k + " -> " + v);});
		people.forEach((k,v) -> {System.out.println(k + " -> " + v);});
		
		
		
		
			
		/**
		 * Access an Item
		 * Method 2- get() - 
		 */
		String getCapitalCity = capitalCities.get("England");
		System.out.println(getCapitalCity);
		
		/**
		 * 
		 * Method 6- forEach
		 * 
		 * Note: Use the keySet() method if I only want the keys, 
		 * 		 Use the values() method if I only want the values:
		 */
		//print keys
//		for (String item : capitalCities.keySet()) {
//			System.out.println(item);
//		}
		//print values
//		for (String item : capitalCities.values()) {
//			System.out.println(item);
//		}
		//print keys and values
		for (String item : capitalCities.keySet()) {
			System.out.println("key: " + item + " value: " + capitalCities.get(item));
		}
		
		/**
		 * To remove an item
		 * Method 3- remove() - 
		 */
		capitalCities.remove("India");
		System.out.println(capitalCities);
		
		/**
		 * To remove all items
		 * Method 4- clear() - 
		 */
		capitalCities.clear();
		System.out.println(capitalCities);
		
		/**
		 * how many items there are
		 * Method 5- size() - 
		 */
		System.out.println(capitalCities.size());
		

		
	}
}
