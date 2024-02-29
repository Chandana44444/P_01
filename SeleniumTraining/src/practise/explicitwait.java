package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.shoppersstack.com/");
		explicitWait.until(ExpectedConditions.titleContains("ShoppersStack"));
		driver.findElement(By.xpath("(//span[contains(text(),'APPLE')])[1]")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560098");
		WebElement checkButton = driver.findElement(By.id("Check"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkButton));
//		explicitWait.until(ExpectedConditions.elementToBeSelected(checkButton));//timeoutExeception
//		while(!checkButton.isEnabled()) { }
		checkButton.click();
		
		Thread.sleep(8000);
		driver.quit();

	}

}
