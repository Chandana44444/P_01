package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DWS_Register {
	@DataProvider()
	public String[][] datas() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(new File("./resources/DWS_Register.xlsx"));
		Workbook wb = WorkbookFactory.create(fis);// excel library

		Sheet sheetName = wb.getSheet("Sheet2");
		int rowCount = sheetName.getPhysicalNumberOfRows();
		int info = sheetName.getRow(0).getPhysicalNumberOfCells() ;

		String[][] arr = new String[rowCount][info];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < info; j++) {
//				arr[i][j] =sheetName.getRow(i).getCell(j).toString();
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		return arr;
	}

//	@DataProvider(name = "test2", parallel = true)
//	public String[][] data() {
//		String[][] arr = { { "FemalE", "Chandana", "Manjesh", "chandu@gmail.com", "Chandu@123", "Chandu@123" },
//				//{ "female", "Poornima", "Anjanappa", "pooo@gmail.com", "Poo@612", "Poo@612" },
//				//{ "male", "Appu", "Punith", "pooo@gmail.com", "Poo@613", "Poo@613" }
//
//		};
//		return arr;
//	}
	

	@Test(dataProvider = "datas")
	public void login1(String[] arr) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demowebshop.tricentis.com/register");
		if(arr[0].equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		}
		if(arr[0].equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
		}
//		driver.findElement(By.id("gender-" + arr[0].toLowerCase())).click();
		driver.findElement(By.id("FirstName")).sendKeys(arr[1]);
		driver.findElement(By.id("LastName")).sendKeys(arr[2]);
		driver.findElement(By.id("Email")).sendKeys(arr[3]);
		driver.findElement(By.id("Password")).sendKeys(arr[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[5]);
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
		Thread.sleep(7000);
		driver.quit();
	}
		
}