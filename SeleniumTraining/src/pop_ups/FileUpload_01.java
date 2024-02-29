package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_01 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	WebElement uploadButton = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
	uploadButton.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", uploadButton);
//	Thread.sleep(2000);
//	uploadButton.sendKeys("D:\\Sumanth ELF\\CourseContentSelenium.pdf");
//	
}
}
