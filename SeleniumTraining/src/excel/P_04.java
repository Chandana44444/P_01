package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class P_04 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File file=new File("./Excel/Practise_01.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		int row_count = wb.getSheet("Sheet3").getPhysicalNumberOfRows();
		int cell_count = wb.getSheet("Sheet3").getRow(0).getPhysicalNumberOfCells()-1;
		
		String[][] arr=new String[row_count][cell_count];
		
		for(int i=0;i<row_count;i++) {
			for(int j=0;j<cell_count;j++) {
				arr[i][j]=wb.getSheet("Sheet3").getRow(i).getCell(j+1).toString();
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
