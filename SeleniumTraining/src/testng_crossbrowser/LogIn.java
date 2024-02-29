package testng_crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogIn {
//	WebDriver driver;
	String browsername="Edge";
	@Parameters("browsername")
	@Test
	public void m2(@Optional("EDGE")String browsername) throws InterruptedException {
		WebDriver driver = null;
//		WebDriver driver = new ChromeDriver();
	
//		if (browsername.equals("chrome")) {
			if (browsername.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
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
