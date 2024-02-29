package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ToLaunchEmptyBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver1=new ChromeDriver();
		Thread.sleep(3000);
		driver1.quit();
		EdgeDriver driver2=new EdgeDriver();
		Thread.sleep(3000);
		driver2.quit();
		FirefoxDriver driver3=new FirefoxDriver();
		Thread.sleep(3000);
		driver3.quit();
		InternetExplorerDriver driver4=new InternetExplorerDriver();
		Thread.sleep(3000);
		driver4.quit();		

	}

}
