package week2.day1.classroom;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Listener implements IRetryAnalyzer {
	int count = 0;

	public boolean retry(ITestResult result) {
		//retry will have happen only when we set count
		if(count<2) {
			count++;
			return true;
		}
		return false;
	}

}
