package webelement_mthds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_ToolTip {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.woodenstreet.com/study-room-furniture");
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginclose1")).click();
		Thread.sleep(2000);
		WebElement tool_tip = driver.findElement(By.cssSelector("img[alt='Laptop Tables']"));
		String title = tool_tip.getAttribute("id");
		if(title==null) {
			System.out.println("No attribute present");
		}
		System.out.println(title);
		Thread.sleep(2000);
        driver.quit();
        
//        driver.get("https://www.woodenstreet.com/");
//		Thread.sleep(2000);
//		String toolTipText = driver.findElement(By.cssSelector("img[title='Wooden TV Unit']")).getAttribute("title");
//		System.out.println(toolTipText);
		
	}
}
