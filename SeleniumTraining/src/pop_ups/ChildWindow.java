package pop_ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Google+")).click();
		Thread.sleep(2000);
		Set<String> all_windows_id = driver.getWindowHandles();
		
		for(String id:all_windows_id) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Demo")) {
				driver.close();
			}
		}
	}
}
