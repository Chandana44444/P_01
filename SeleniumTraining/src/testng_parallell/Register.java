package testng_parallell;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Register {
	@Test
	public void m2() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("From DWS Register", true);
		Thread.sleep(1000);
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Chandana");
		driver.findElement(By.id("LastName")).sendKeys("Poo");
		driver.findElement(By.id("Email")).sendKeys("chandana.m@testyantra.in");
		driver.findElement(By.id("Password")).sendKeys("Chandu_DWS");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Chandu_DWS");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
