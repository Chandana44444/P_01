package testng_prjct_helper_attribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithGroups1 {
	//@Test(dependsOnMethods  = "m2")=>error,fail,skip
	//@Test(alwaysRun = true,dependsOnMethods  = "m2")=>error,pass,fail,no skip
	
	@Test(groups = "Function")
	public void functional_testing_01() {
		//int a=10/0;
		Reporter.log("Hi From Priority M1()");//on report
		Reporter.log("Hi From group M1()",true);//on console
	}
	
	@Test(groups = "Function")
	public void functional_testing_02() {
		int a=10/0;
		Reporter.log("Hi From Priority M2()");//on report
		Reporter.log("Hi From group M2()",true);//on console
	}
	

}
