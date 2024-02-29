package staleness;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_01 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement login_btn = driver.findElement(By.linkText("Log in"));
	login_btn.click();
	Thread.sleep(5000);
	login_btn.click();
}
}
