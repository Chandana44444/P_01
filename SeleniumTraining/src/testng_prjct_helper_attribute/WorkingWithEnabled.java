package testng_prjct_helper_attribute;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithEnabled {
	// by default true
	
	@Test(enabled = false)//will not run even once
	public void m1() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Reporter.log("From Google", true);
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(enabled = true)//will run once
	public void m2() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("From DWS", true);
		Thread.sleep(3000);
		driver.quit();
	}

}
