package Listeners_Class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class L_output extends Baseclass implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("on finish");
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("onstart");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("on test failedbutwithinsucces");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
		System.out.println("OnTestFailure");
		
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File source= scrshot.getScreenshotAs(OutputType.FILE);
		File destin=new File("C:\\Seljars\\TestNG Screenshot\\st11.jpg");
		try {
			FileUtils.copyFileToDirectory(source, destin);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("ontestskipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("ontest start");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("ontest succes");
		
	}

}
