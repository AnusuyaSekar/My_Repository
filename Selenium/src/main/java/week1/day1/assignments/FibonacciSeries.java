package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		//  input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		int n=8;
		int n1=0,n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0; i<=n;i++) {
			int n3= n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;  //n1=0, n2=1, n3=1 
			//n1=1, n2=1, n3=2
			//n1=1, n2=2, n3=3
			//n1=2, n2=3, n3=5
				
			}
			
	}
}
//0, 1, 
	


