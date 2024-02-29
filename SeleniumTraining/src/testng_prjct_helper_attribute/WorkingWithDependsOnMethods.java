package testng_prjct_helper_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithDependsOnMethods {
	// if not executed within given time=>"ThreadTimeOutException"
	
	@Test//failure
	public void m1() throws InterruptedException {
		int res=1/0;
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("From DWS", true);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chandana.p.m.4444@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu121*");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(dependsOnMethods = "m1")//skipped
//	@Test(dependsOnMethods = "m")//depends on nonexistent method
//	@Test()
	public void m2() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("From DWS", true);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chandana.p.m.4444@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu121*");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
