package com.student.java_eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamImpl {

	// ## 1_stream_creation (Arrays Impl)
	private static String[] arr = new String[] { "a", "b", "c" };
	private static Stream<String> streamArray = Arrays.stream(arr); //using stream()
											

	public static void main(String[] args) {
		boolean isExist = StreamImpl.getBoolean();
		System.out.println("The array has a in it? " + isExist); // The array has a in it? true

		//### 2_1_iterating
		boolean isExistWithStream = streamArray.anyMatch(p -> p.contains("a"));
		System.out.println("The stream array has a in it? " + isExistWithStream); // The stream has a in it? true
		

		
		
		//## 1_stream_creation (List Impl)
		ArrayList<String> list = new ArrayList<>();
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");

		
		List <String> listOf = List.of("Change","factory","justBefore", "Italy", "Thursday");
		
		
		
		
		//### 2_1_iterating
		for (String item : list) {
			if (item.contains("a"))
			System.out.println(item); //Change, factory, Italy, Italy, Thursday
		}
		
		
		/** ### 2_2_filtering
		 * This code creates Stream<String> of the List<String>,
		 finds all elements of this stream which contain char “a”,
		 and creates a new stream containing only the filtered elements:
		 */
		Stream<String> streamList = list.stream().filter(p -> p.contains("a")); 
	
		
		
	
		/** ##misc
		 * 
		 */
		//List<Object> numbers =  new Random().ints(0,350).limit(10).boxed().collect(Collectors.toList());


		

	
		
	}

	public static Boolean getBoolean() {
		for (String string : arr) {
			if (string.contains("a")) {
				System.out.println("I have a in the list"); // I have a in the list
			}
		}
		return true;
	}

}
