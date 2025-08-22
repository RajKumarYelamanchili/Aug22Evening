package retry;



	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class TestCases {

		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void TC_01_verifyTest1() throws InterruptedException
		{
			System.out.println("Testcase1");
			Thread.sleep(1000);
		}
		
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void TC_02_verifyTest2() throws InterruptedException
		{
			System.out.println("Testcase2");
			Assert.assertTrue(false);
			Thread.sleep(1000);
		}
		
		
	}



