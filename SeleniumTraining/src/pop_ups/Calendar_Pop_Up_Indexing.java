package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Pop_Up_Indexing {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.via.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		if(driver.findElement(By.cssSelector("button[class=\"No thanks\"]")).isDisplayed()) {
			driver.findElement(By.cssSelector("button[class=\"No thanks\"]")).click();
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class=\"calendar-icon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='5'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='element return-element']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='15'])[4]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
