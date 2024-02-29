package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staleness {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	loginLink.click();
	
	 WebElement email = driver.findElement(By.id("Email"));
	WebElement pwd = driver.findElement(By.id("Password"));
	WebElement btn = driver.findElement(By.cssSelector("input[value=\"Log in\"]"));
	
	email.sendKeys("abc@123");
	pwd.sendKeys("1234");
	btn.click();
	
	Thread.sleep(500);
	
	email.clear();
	pwd.clear();
	
	Thread.sleep(500);
	
	email.sendKeys("abc@123");
	pwd.sendKeys("1234");
	btn.click();
	
	
//	loginLink = driver.findElement(By.linkText("Log in"));
//	loginLink.click();
	
	Thread.sleep(6000);
	driver.quit();
}
}