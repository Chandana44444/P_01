package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_01 {
public static void main(String[] args) throws IOException {
	File f=new File("./Excel/Practise_01.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=WorkbookFactory.create(fis);
	
	String cell_count = wb.getSheet("Sheet1").getActiveCell().toString();
	System.out.println(cell_count);
	
	System.out.println(wb.getSheet("Sheet1").getRow(6).getCell(7).getStringCellValue());
	System.out.println(wb.getSheet("Sheet1").getRow(4).getCell(17).getBooleanCellValue());
	System.out.println(wb.getSheet("Sheet1").getRow(12).getCell(14).getLocalDateTimeCellValue());
	System.out.println(wb.getSheet("Sheet1").getRow(12).getCell(14).getDateCellValue());
	System.out.println(wb.getSheet("Sheet1").getRow(6).getCell(11).getNumericCellValue());

	System.out.println("*****************************************");

	System.out.println(wb.getSheet("Sheet1").getRow(6).getCell(7).toString());
	System.out.println(wb.getSheet("Sheet1").getRow(4).getCell(17).toString());
	System.out.println(wb.getSheet("Sheet1").getRow(12).getCell(14).toString());
	System.out.println(wb.getSheet("Sheet1").getRow(12).getCell(14).toString());
	System.out.println(wb.getSheet("Sheet1").getRow(6).getCell(11).toString());

	
}
}
