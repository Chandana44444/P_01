package javascript_prgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_05 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/signup");
	WebElement hiddenTextBox = driver.findElement(By.name("custom_gender"));
	Thread.sleep(2000);
	driver.executeScript("arguments[0].value='Data entered';", hiddenTextBox);
	
	Thread.sleep(6000);
	driver.quit();
}
}
