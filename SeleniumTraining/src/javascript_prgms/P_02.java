package javascript_prgms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,600);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-600);");
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
