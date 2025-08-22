package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TEST CASE STARTED");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TEST CASE PASSED");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TEST CASE FAILED");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TEST CASE SKIPPED");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("TEST SUITE STARTED");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TEST SUITE FINISHED");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
