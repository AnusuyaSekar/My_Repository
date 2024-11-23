/**
 * 
 */
package week1.day1.assignments;

public class ConvertANegativeToPositiveNo {

	public static void main(String[] args) {
		int number = 0;
		if(number<0) {
			System.out.println(number + " is a negative no");
			number=-number;
			System.out.println(number);
		}else if(number==0)
			System.out.println(number + " neither a positive nor a negative no");
		else {
			System.out.println(number + " is a postive no");
		}
		
				

	}

}
