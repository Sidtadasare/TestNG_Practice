package IRetry_Analyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Method_OF_Iretry implements IRetryAnalyzer {

	int count=0;
	int retry=2;
	
	
	@Override
	public boolean retry(ITestResult arg0) {
		
		if(count<retry) {
			count++;
			return true;
		}
			
		return false;
	}

}
