package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P_03 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File f=new File("./Excel/Practise_01.xlsx");
	FileInputStream fis=new FileInputStream(f);
	
	Workbook wb=WorkbookFactory.create(fis);
	
	int data = wb.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
	
	String[] arr1=new String[data];
	
	for(int i=0;i<data;i++) {
		arr1[i]=wb.getSheet("Sheet2").getRow(0).getCell(i).toString();
	}
	
	for(int i=0;i<data;i++) {
		System.out.print(arr1[i]+" ");
	}
	
//	for(String s:arr1) {
//		System.out.println(s);
//	}
}
}
