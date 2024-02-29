package itestlistener;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_02 extends BaseClass {
	@Test
	public void scrip_01() throws InterruptedException {
		Reporter.log("test script_02", true);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("FirstName")).sendKeys("abcd");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("abcd");
		Thread.sleep(8000);
	}
//	public static void main(String[] args) {
//		LocalDateTime date=LocalDateTime.now();
//		System.out.println(date);
//	}
}
