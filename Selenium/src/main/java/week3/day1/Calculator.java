package week3.day1;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public double sub(double a, double b) {
		return a-b;
	}
	public double mul(int a, int b) {
		return a*b;
	}
	public double mul(int a, double b) {
		return a*b;
	}

	public static void main(String[] args) {
		Calculator calci = new Calculator();
	System.out.println(calci.add(2, 3));
	System.out.println(calci.add(0, 0, 0));
	System.out.println(calci.sub(2.5, 1.6));
	System.out.println(calci.sub(3, 1));
	System.out.println(calci.mul(2, 3.5));
	System.out.println(calci.mul(2, 3));
		
	}

}
