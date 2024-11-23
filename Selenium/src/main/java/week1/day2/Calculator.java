package week1.day2;

public class Calculator {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	public double sub(double a, double b) {
		double c = a-b;
			return c;
		 
		
	}
	public double mul(double a, double b) {
		double c = a*b;
			return c;
	}
	
	public int div(int a, int b) {
		int c = a/b;
			return c;
		 
		
	}
	public static void main(String[] args) {
		Calculator calci= new Calculator();
		System.out.println(calci.add(10, 5));
		System.out.println(calci.sub(10.2, 5.1));	
		System.out.println(calci.mul(10.2, 5.1));
		System.out.println(calci.div(10, 5));	
	}

}
