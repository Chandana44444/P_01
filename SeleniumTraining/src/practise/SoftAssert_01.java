package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_01{
String name="chandana";
	@Test
	public void launch_App() throws InterruptedException {
		SoftAssert sa=new SoftAssert();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		sa.assertEquals(driver.getTitle(), "Demo Web Shop","user has not landed to DWS welcome page");
		driver.findElement(By.linkText("Register")).click();
		sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","user has not landed to DWS Register page");
		WebElement gender = driver.findElement(By.id("gender-female"));
		sa.assertFalse(gender.isSelected(), "user has not clicked on female option");
//		gender.click();
//		assertTrue(gender.isSelected(),"user has clicked on female option");
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys(name);
		fname.clear();
//		fname.sendKeys("selenium");
		sa.assertEquals(fname.getAttribute("value"), "chandana","firstname is not matching");
		Thread.sleep(5000);
//		sa.assertAll("ERRORS:-");
		driver.quit();
		sa.assertAll("ERRORS:-");//will close

		

}
}
