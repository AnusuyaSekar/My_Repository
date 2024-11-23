package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int input=153;
	int orgno= input;
	int i=1;
	int sum=0;
	while (i>0) {	
		int rem=input%10;
		sum=sum+(rem*rem*rem);
		input=input/10;
		i++;
			}
	System.out.println(sum);
	if(orgno==sum) {
		System.out.println("This is Armstrong No");
		}
	else {
		System.out.println("This is not an Armstrong No");
	
	}

}
}
