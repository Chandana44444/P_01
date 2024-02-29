package dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	Thread.sleep(3000);
	WebElement from = driver.findElement(By.id("draggable"));
	WebElement To = driver.findElement(By.id("droppable"));
	Actions action=new  Actions(driver);
	action.dragAndDrop(from, To).perform();
	driver.quit();
}
}
