package week1.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//Week 3 Day 2 Assignment - 3
public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given Array
		Integer[] numbers = { 4, 6, 7, 2, 3, 1, 9, 10, 8, 8, 6, 2 };
		
		// Add Array to Set to Remove Duplicates
		Set<Integer> setNum = new TreeSet<Integer>(Arrays.asList(numbers));
		// setNum.addAll(Arrays.asList(numbers));
		System.out.println("The Given Numbers in the List : " + setNum);

		//Add the Set to List to find the Missing Number
		List<Integer> addToList = new ArrayList<Integer>(setNum);
		for (int j = 0; j < addToList.size(); j++) {
			if (addToList.get(j) != j + 1) {
				System.out.println("The Missing Number in the List : " +(j + 1));
				break;
			}
		}
	}
}