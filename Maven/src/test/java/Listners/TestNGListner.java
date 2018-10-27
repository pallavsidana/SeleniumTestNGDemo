package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	public void onFinish(ITestContext result) {
		
		
		System.out.println(result.getName());
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println(" test is started:"+arg0.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("test is failed"+arg0.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("i am skipped"+arg0.getName());
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
