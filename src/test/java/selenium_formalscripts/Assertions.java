package selenium_formalscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	
	//author Ravi
	@Test
	public void TC001_verifyTestAddition()
	{

			
		int ExpectedResult=5;
		int ActualResult=2 +2;
		
		Assert.assertEquals(ExpectedResult,ActualResult,"Addition failed");
		
		
	}
	
	//author Sunil
		@Test
		public void TC002_verifyMultiplication()
		{

			int ActualResult=2*3;
			
		  Assert.assertNotEquals(ActualResult,6,"Both are equal");
				
		}
	
		//author @Gita
		@Test
		public void TC003_verifyEvenNumber()
		{
			
			int num=13;
			Assert.assertTrue(num%2==0, "Number is not even");
			
		}
	
		//author @Sita
				@Test
				public void TC004_verifyOddNumber()
				{
					
					int num=16;
					Assert.assertFalse(num%2==0, "Number is even");
					
				}
		
		

}
