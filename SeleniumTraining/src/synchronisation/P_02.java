package synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P_02 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(4));
	
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.partialLinkText("KIDS")).click();//time is applicable only for findelements
//	driver.findElement(By.xpath("//span[text()='cutiekins ']")).click();
//	
//	WebElement checkButton = driver.findElement(By.id("Check"));
//	explicitWait.until(ExpectedConditions.elementToBeSelected(checkButton));
////	while(!checkButton.isEnabled()) { }
//	checkButton.click();
//	Thread.sleep(6000);
//	driver.quit();
	
//	explicitWait.until(ExpectedConditions.titleContains("Demo Web Shop"));
	
}


}

