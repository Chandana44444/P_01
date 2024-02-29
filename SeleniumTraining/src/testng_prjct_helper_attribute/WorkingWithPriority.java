package testng_prjct_helper_attribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithPriority {
	//runs based on ascii value of methodname
	//by default zero to proove dont give priority to one method
	//can give:-+ve,-ve,' '
	//low to high
	//can give a final var value
	
	final int val=-1;

	@Test(priority = -val)
	public void m1() {
		Reporter.log("Hi From Priority M1()");//on report
		Reporter.log("Hi From Priority M1()",true);//on console
	}
	
	@Test(priority = 1)
	public void m2() {
		Reporter.log("Hi From Priority M2()");//on report
		Reporter.log("Hi From Priority M2()",true);//on console
	}

}
