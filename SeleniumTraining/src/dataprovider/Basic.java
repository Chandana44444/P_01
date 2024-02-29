package dataprovider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic {

	@DataProvider(name="info")
    public String[][] info(){
		String[][] arr=new String[2][3];
		
		arr[0][0]="Name1";
		arr[0][1]="Subject1";
		arr[0][2]="Mock Rating1";
		
		arr[1][0]="Name2";
		arr[1][1]="Subject1";
		arr[1][2]="Mock Rating1";
		
		return arr;
	}
	
	@DataProvider(name="info1")
	public String[][] info1(){
		String[][] arr=new String[2][3];
		
		arr[0][0]="Name4";
		arr[0][1]="Subject1";
		arr[0][2]="Mock Rating1";
		
		arr[1][0]="Name5";
		arr[1][1]="Subject1";
		arr[1][2]="Mock Rating1";
		
		return arr;
	}
	
	@Test(dataProvider="info1")
	public void data(String name,String subject,String rating) {
		
		Reporter.log(name,true);
		Reporter.log(subject,true);
		Reporter.log(rating,true);
		Reporter.log("*****************",true);
	
	}
}
