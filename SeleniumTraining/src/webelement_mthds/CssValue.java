package webelement_mthds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		System.out.println("Tag name:"+driver.findElement(By.cssSelector("input[value='Log in']")).getTagName());
		System.out.println("Color:"+ driver.findElement(By.cssSelector("div[class='validation-summary-errors']")).getCssValue("position"));
        driver.quit();
	}

}
