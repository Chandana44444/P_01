package pop_ups;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUplaod {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("https://www.naukri.com/");
			driver.findElement(By.id("register_Layer")).click();
			WebElement uploadButton = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
			uploadButton.click();
			Actions actions = new Actions(driver);
			actions.scrollToElement(uploadButton).scrollByAmount(0, 100).perform();
			Thread.sleep(2000);
			uploadButton.sendKeys("C:\\Users\\User\\Desktop\\Selenium Syllabus.txt");
			
		}
	}
