package findelements_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_01 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	List<WebElement> gender = driver.findElements(By.xpath("//div[@class=\"gender\"]"));
	
	System.out.println(gender);//address
	
	for(int i=0;i<gender.size()-1;i++) {
		gender.get(i).click();
	}
	
	Thread.sleep(5000);
	driver.quit();
}
}
