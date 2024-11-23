package week1.day2.assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		//System.out.println(arr.length-1);
		for(int i=0;i<=arr.length-1;i++) {
			//System.out.println(arr[i]); 
			for (int j=i+1;j<=arr.length-1;j++) {
				//System.out.println(arr[j]);
				if(arr[i]==arr[j]) {      
					System.out.println(arr[i]);
				}
			}
					}

	}

}
