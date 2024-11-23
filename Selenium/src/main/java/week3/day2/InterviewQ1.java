package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class InterviewQ1 {
	
	

	public static void main(String[] args) {
		String companyName= "amazon";
		
		char[] charArray = companyName.toCharArray();
		//System.out.println(charArray[0]);
		
		Set <Character> characters = new LinkedHashSet <Character>();
					
		for(int i=0; i<charArray.length;i++) {
			if(characters.add(charArray[i])) {
				System.out.println(charArray[i]);
			}
		}
	
		
		
		
		
	
		
}}
