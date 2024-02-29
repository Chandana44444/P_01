package dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement ele = driver.findElement(By.cssSelector("li[name='C']"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(ele).perform();
		
//		driver.quit();
	}

}
