package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P_05 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File file=new File("./Excel/Practise_01.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		int row_count = wb.getSheet("Sheet4").getPhysicalNumberOfRows();
		int cell_count = wb.getSheet("Sheet4").getRow(0).getPhysicalNumberOfCells();
		
		String[][] arr=new String[row_count][cell_count];
		
		for(int i=0;i<row_count;i++) {
			for(int j=0;j<cell_count;j++) {
				arr[i][j]=wb.getSheet("Sheet4").getRow(i).getCell(j).toString();
			}
		}
		
		for(int i=0;i<row_count;i++) {
			for(int j=0;j<cell_count;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
