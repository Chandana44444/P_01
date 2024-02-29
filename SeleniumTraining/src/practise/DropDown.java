package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void selectLastOption(WebElement dropDownElement) {
		Select listbox = new Select(dropDownElement);
		int totalNoOfOptions = listbox.getOptions().size();
		listbox.selectByIndex(totalNoOfOptions-1);
	}
	
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://demoapp.skillrary.com/");
	WebElement multiListBox = driver.findElement(By.id("cars"));
	Select courseByPriceSelect = new Select(multiListBox);
	
	courseByPriceSelect.selectByIndex(1);
	Thread.sleep(1000);
	courseByPriceSelect.selectByValue("299");
	Thread.sleep(1000);
	courseByPriceSelect.selectByVisibleText("Free ( 90 )");
	Thread.sleep(1000);
	System.out.println(courseByPriceSelect.getFirstSelectedOption().getText());
	
	courseByPriceSelect.deselectByIndex(0);
	Thread.sleep(1000);
	courseByPriceSelect.deselectByValue("99");
	Thread.sleep(1000);
	courseByPriceSelect.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
	
	selectLastOption(multiListBox);

}
}
