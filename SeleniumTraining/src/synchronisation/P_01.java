package synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		WebElement kids = driver.findElement(By.linkText("Kids"));// time is applicable only for findelements
		actions.moveToElement(kids).perform();
		actions.click().perform();

		//Thread.sleep(4000);

		driver.findElement(By.xpath("//span[text()='cutiekins ']")).click();

		Thread.sleep(4000);
		driver.quit();
	}

}
