package com.student.java_eight;

import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.student.java_eight.Detail;

public class JavaStreamApi {
	
	public static void main(String[] args) {
		
	
//
//		//A stream() default method is added to the Collection interface and
//		//allows creating a Stream<T> using any collection as an element source:
//		Stream<String> streamnew = list.stream();

		/* 1_stream_creation
		 * Example 2	
		 */
		Stream <Integer> normalStream = Stream.of(1,2,3,4,5);
		IntStream intStreamByRange = IntStream.range(1, 6);
		
		
		/* first – invoke the peek() method to collect processed elements to a result list
		 * then – sort the elements
		 * finally – take the first element from the Stream
		 * 
		 * STREAM.peek(add to a result list)
  				.sorted()
  				.findFirst();
		 */
		/*
		 * As the two Streams contain the same integer elements, I’d think after the executions, 
		 * the two result lists should also contain the same integers. So next,  I will write a test to check if it produces the result we expect:
		 * 
		 * After the execution, it turns out that the result list filled by normalStream.peek() contains all integer elements.
		 *  However, the list filled by intStreamByRange.peek() has only one element.
		 */
		List<Integer> normalStreamPeekResult = new ArrayList<>();
		List<Integer> intStreamPeekResult = new ArrayList<>();
		
		// First, the regular Stream
		normalStream.peek(normalStreamPeekResult::add)
			.sorted()
			.findFirst();
		//assertEquals(Arrays.asList(1,2,3,4,5), normalStreamPeekResult);
		
		
		// Then, the IntStream
		intStreamByRange.peek(intStreamPeekResult::add)
			.sorted()
			.findFirst();
		//assertEquals(Arrays.asList(1), intStreamPeekResult);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		/*
		 * 2.3- Mapping
		 * convert elements of a Stream by applying a special function to them and
		 * to collect these new elements into a Stream, I can use the map() method:
		 */
		
		// This code converts Stream<String> to the Stream<Path> 
		// by applying a specific lambda expression to every element of the initial Stream.
		List <String> uris = new ArrayList<>();
		uris.add("/JavaSE/src/com/student/java_eight/file1.txt");
		Stream<Path> strean = uris.stream().map(uri -> Paths.get(uri));
		
		
		
		// If I have a stream where every element contains its own sequence of elements and
		// I want to create a stream of these inner elements, I should use the flatMap() method
		
		// In this code, I have a list of elements of type Detail.
		// The Detail class contains a field PARTS, which is a List<String>
		// With the help of the flatMap() method, every element from field PARTS will be extracted and added to the new resulting stream
		// After that, the initial Stream<Detail> will be lost.
		List <Detail> details = new ArrayList<>();
		details.add(new Detail());
		Stream <String> streap = details.stream().flatMap(detail -> detail.getParts().stream());
		
		/*
		 * 2.4- Matching
		 */
			
	}
	
	

	
}
