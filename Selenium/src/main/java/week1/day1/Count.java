package week1.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Count {

	public static void main(String[] args) {
		String name = "Apple";
		char character='p';
		int count=0;
		char[] charArray = name.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i]==character) {
			count++;
		}
		
		}
		System.out.println(count);
		System.out.println(count);


	}
}



