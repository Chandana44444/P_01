package itestlistener;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_01 extends BaseClass {
	@Test
	public void scrip_01() {
		Reporter.log("test script_01", true);
		driver.findElement(By.id("uggu")).click();;
	}

}
