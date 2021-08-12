package smarttech.batch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelSheetTest {

	public static void main(String[] args) throws Exception {
		
		//Class 13 Day Time is 3:35 H
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\ozias\\OneDrive\\Desktop\\apachereader.xls"));
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		
		String value= sheet.getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		//Class 13 Day Time is 3:48 H
		sheet.getRow(8).getCell(0).setCellValue("ZM Hoque");
		FileOutputStream fso= new FileOutputStream("C:\\Users\\ozias\\OneDrive\\Desktop\\apachereader.xls");
		wb.write(fso);
		
		String value2= sheet.getRow(8).getCell(0).getStringCellValue();
		
		System.out.println(value2);
		
	}

}
