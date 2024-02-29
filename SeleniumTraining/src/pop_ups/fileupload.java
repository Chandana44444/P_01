package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class fileupload {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.totaljobs.com/Account/Register");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='Accept All']")).click();
			driver.findElement(By.id("btnCVUpload")).click();
			Thread.sleep(2000);
			WebElement btn = driver.findElement(By.xpath("//label[text()='from this device']"));
			btn.click();
			btn.sendKeys("C:\\Users\\User\\Desktop\\Selenium Syllabus.txt");
			Thread.sleep(2000);
			
			driver.quit();
	        
		}
	}

