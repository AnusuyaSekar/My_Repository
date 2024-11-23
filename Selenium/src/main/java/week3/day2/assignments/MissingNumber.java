package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int [] array =  { 4, 6, 7, 2, 3, 1, 9, 10, 8, 8, 6, 2 };
		List<int[]> asList = Arrays.asList(array);
		Set <Integer> numbers = new TreeSet <Integer>();
		List <Integer> numbers1 = new ArrayList <Integer>(numbers);
		//System.out.println(numbers1);
		int size = numbers.size();
		
	}

}
