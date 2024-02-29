package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Pop_Up {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.via.com/");
		Thread.sleep(3000);
		if(driver.findElement(By.cssSelector("button[class=\"No thanks\"]")).isDisplayed()) {
			driver.findElement(By.cssSelector("button[class=\"No thanks\"]")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"calendar-icon\"]")).click();
		Thread.sleep(3000);
		String date="3";
	//	driver.findElement(By.xpath("(//span[@class='vc-month-box-head-cell '])[1]/../..//div[text()='"+date+"']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("div[class='element return-element']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("((//span[@class='vc-month-box-head-cell '])[2]/../..//div[text()='"+date+"'])[1]")).click();
//		Thread.sleep(3000);
//		driver.quit();
	}

}
