package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
		Thread.sleep(3000);
	    org.openqa.selenium.Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		driver.quit();
	}

}
