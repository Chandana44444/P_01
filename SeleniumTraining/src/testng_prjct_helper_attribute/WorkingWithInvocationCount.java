package testng_prjct_helper_attribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithInvocationCount {
	//runs based on count
	//by default one
	//can give:-+ve,-ve,' '
	//-ve:will not run even once
	//can give a final var value
	
	final int val=-1;

	@Test(invocationCount = 8,invocationTimeOut = 0)//pass
	public void m1() {
		Reporter.log("Hi From Priority M1()");//on report
		Reporter.log("Hi From Priority M1()",true);//on console
	}
	
	@Test()
	public void m2() {
		Reporter.log("Hi From Priority M2()");//on report
		Reporter.log("Hi From Priority M2()",true);//on console
	}

}
