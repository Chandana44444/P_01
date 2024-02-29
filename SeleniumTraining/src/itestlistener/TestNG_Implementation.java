package itestlistener;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNG_Implementation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Execution Started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Execution Success", true);
	}
	
	int no=1;//will reintialize each time when we run

	LocalDateTime date=LocalDateTime.now();
	String time=date.toString().replace(":", "-");

	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Execution Failed", true);
		
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    File destiny=new File("screenshots//"+time+"_snap.png");
 
	    try {
			FileHandler.copy(source, destiny);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
//	    int i=Integer.parseInt(time); 
//	    i++;
	     
	}

}
