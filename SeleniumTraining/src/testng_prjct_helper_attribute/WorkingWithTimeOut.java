package testng_prjct_helper_attribute;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithTimeOut {
	// if not executed within given time=>"ThreadTimeOutException"
	
	@Test(enabled = false)//will not run even once
	public void m1() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Reporter.log("From Google", true);
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(timeOut = 5000)//will run once if not able to run within specified time 
	//than exception called "TimeOutException"
	public void m2() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		Reporter.log("From ShopperStack", true);
		Thread.sleep(3000);
		driver.quit();
	}

}
