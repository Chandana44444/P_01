package testng_prjct_helper_attribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithGroups2 {
	//@Test(dependsOnMethods  = "m2")=>error,fail,skip
	//@Test(alwaysRun = true,dependsOnMethods  = "m2")=>error,pass,fail,no skip
	
	@Test(dependsOnGroups = "Function",groups = "Function")
	public void integration_testing_01() {
		//int a=10/0;
		Reporter.log("Hi From Priority M2()");//on report
		Reporter.log("Hi From group M3()",true);//on console
	}

}
