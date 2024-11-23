package week1.day2;

public class Continue {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			if(i==3) {
				System.out.println("Three");
				continue;
			}
        System.out.println(i);
		}

	}
}
