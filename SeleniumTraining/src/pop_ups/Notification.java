package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://in.puma.com/");
	
	Thread.sleep(2000);
	
	ChromeOptions settings=new ChromeOptions();
//	settings.addArguments("--disable-notifications ");
	
//	Robot robot=new Robot();
//	robot.keyPress(KeyEvent.VK_TAB);
//	Thread.sleep(2000);
//	robot.keyPress(KeyEvent.VK_ENTER);
//	Thread.sleep(2000);
//	robot.keyRelease(KeyEvent.VK_TAB);
//	robot.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(3000);
	driver.quit();
	
	
}
}
