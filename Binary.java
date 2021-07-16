package edu.princeton.cs.algs4.customised;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Binary {
	
	// Binary search will need to find a specific int "number" in an array "range".
	@SuppressWarnings("unlikely-arg-type")
	
	public static int binarySearch(int number, Integer[] range) {
		
		int low = 0;
		int high = range.length-1;
		int mid = (low + high) / 2;
        List<Integer> intRange = Arrays.asList(range);

		boolean value = intRange.contains(number);
		
		if (range[mid] == number) {
			
			return mid;
		} 
		
		if (value == false) {
			return -1;
		}
		
		while (range[mid] != number) {
			
			if (number > range[mid]) {
				
				low = mid;
				mid = (low + high) / 2;
			
			} 
			else if (number < range[mid]){

				high = mid;
				mid = (low + high) / 2;
				
			} 

		}
		return mid;
	}		

	public static void main(String[] args) {
		
		int number = 1;
		Integer [] range = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
		
		System.out.println(binarySearch(number, range));
	}
}
