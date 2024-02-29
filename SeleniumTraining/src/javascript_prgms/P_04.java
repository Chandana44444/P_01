package javascript_prgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.linkText("Selenium Using Java"));
		WebElement disabledBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(2000);
		driver.executeScript("arguments[0].scrollIntoView(false);", ele);//BOTTOM
		driver.executeScript("arguments[0].scrollIntoView(true);", ele);//TOP
		driver.executeScript("arguments[0].scrollIntoView(false);", ele);
        Thread.sleep(6000);
        driver.quit();
	
	}
	
}
