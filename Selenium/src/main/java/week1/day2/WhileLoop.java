package week1.day2;

public class WhileLoop {

	public static void main(String[] args) {
		int n=345;
		int sum=0;
		int i=1;
		while(i>0){
			sum= sum+n%10;
			n=n/10;
			i++;
		}
		System.out.println(sum);
	}

}
