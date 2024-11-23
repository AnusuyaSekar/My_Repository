package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		//1.Ascending order
		//2.second element from last
		Arrays.sort(data);
		int lenght =data.length;
		//System.out.println(lenght);
		int secondLargestNo = data[lenght-2];
		System.out.println(secondLargestNo);

	}

}
