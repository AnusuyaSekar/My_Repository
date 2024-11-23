package week1.day1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int n=1234 ;
		int sum=0;int rem = 0;
		for(int i=1;i<=n;i++) {
		rem= n%10; //R=4,3,2,
		//System.out.println(rem);
	    n= n/10;//Q=123,12,1
	   System.out.println(n);
	    sum=sum+rem;
	    }
	{
	    System.out.println(sum);

		

	}
	}
}


