package testng_prjct_helper_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithThreadPoolSize {
	// runs based on count of threadpoolsize works along with invocation count
	// by default one
	// can give:-+ve,-ve,' '
	// -ve:will not create a pool to run by default runs in only one browser
	// can give a final var value

	final int val = -1;

//	@Test(threadPoolSize = 2,invocationCount = 2)//2 browser
//	@Test(threadPoolSize = 0,invocationCount = 2)//one browser
	//@Test(threadPoolSize = 2,invocationCount = 1)//run once
	public void m1() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Reporter.log("From Google", true);
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(threadPoolSize = 2,invocationCount = 2,invocationTimeOut = 40000)
	public void m2() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.shoppersstack.com/");
		Reporter.log("From DWS", true);
		driver.findElement(By.partialLinkText("WOMEN")).click();
		//Thread.sleep(3000);
		driver.quit();
	}

}
