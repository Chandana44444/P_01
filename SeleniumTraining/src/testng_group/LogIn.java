package testng_group;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogIn {
	
	@Test(groups = "Functional")
	public void m2() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("From DWS LogIn", true);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chandana.p.m.4444@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu121*");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
