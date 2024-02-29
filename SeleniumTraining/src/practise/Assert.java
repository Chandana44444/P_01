package practise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert {
String name="chandana";
	@Test
	public void launch_App() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals(driver.getTitle(), "Demo Web Shop","user has not landed to DWS welcome page");
		driver.findElement(By.linkText("Register")).click();
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","user has not landed to DWS Register page");
		WebElement gender = driver.findElement(By.id("gender-female"));
		System.out.println("is the checkbox selected:"+gender.isSelected());
		assertFalse(gender.isSelected(), "user has not clicked on female option");
//		gender.click();
//		assertTrue(gender.isSelected(),"user has clicked on female option");
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys("name");
//		fname.clear();
//		fname.sendKeys("selenium");
		assertEquals(fname.getAttribute("value"), "chandana","firstname is not matching");
		Thread.sleep(5000);
		driver.quit();
}
}
