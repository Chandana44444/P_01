package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.kalkifashion.com/in/");
	Thread.sleep(5000);
	if(driver.findElement(By.xpath("//button[text()='No thanks']")).isDisplayed()){
	driver.findElement(By.xpath("//button[text()='No thanks']")).click();}
	Thread.sleep(2000);
	if(driver.findElement(By.id("user_close_popup")).isDisplayed()){
	driver.findElement(By.id("user_close_popup")).click();
	}
	driver.findElement(By.partialLinkText("SALWAR")).click();
	Thread.sleep(5000);
	driver.quit();
}
}
