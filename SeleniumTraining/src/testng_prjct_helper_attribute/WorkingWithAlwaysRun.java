package testng_prjct_helper_attribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithAlwaysRun {
	//@Test(dependsOnMethods  = "m2")=>error,fail,skip
	//@Test(alwaysRun = true,dependsOnMethods  = "m2")=>error,pass,fail,no skip
	
	@Test(dependsOnMethods  = "registration",alwaysRun = true)
	public void login() {
		int a=10/0;
		Reporter.log("Hi From Priority M1()");//on report
		Reporter.log("Hi From Priority M1()",true);//on console
	}
	
	@Test
	public void registration() {
		int a=10/0;
		Reporter.log("Hi From Priority M2()");//on report
		Reporter.log("Hi From Priority M2()",true);//on console
	}

}
