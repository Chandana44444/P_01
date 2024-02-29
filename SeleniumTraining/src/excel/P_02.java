package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P_02 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File f=new File("./Excel/Practise_01.xlsx");
	FileInputStream fis=new FileInputStream(f);
	
	Workbook wb=WorkbookFactory.create(fis);
	int cell_count_row = wb.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
	int row_count = wb.getSheet("Sheet2").getPhysicalNumberOfRows();
	
	System.out.println("Rows:"+row_count);
	System.out.println("Cells in a Row:"+cell_count_row);
	
	String[][] arr1=new String[row_count][cell_count_row];
	
	for(int i=0;i<row_count;i++) {
		for(int j=0;j<cell_count_row;j++) {
			arr1[i][j]=wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
		}
	}
	
	for(int i=0;i<row_count;i++) {
		for(int j=0;j<cell_count_row;j++) {
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
	
//	for(String[] one_data:arr1) {
//		for(String data:one_data) {
//		System.out.print(data+" ");
//	}
//		System.out.println();
//	}
	
	
}
}
