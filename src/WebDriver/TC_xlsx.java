package WebDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;

public class TC_xlsx {
public static void main(String[] args) throws Exception {
	FileInputStream filein= new FileInputStream("F:\\FileRead.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(filein);
	XSSFSheet sheet= wb.getSheet("test");
	System.out.println(sheet.getSheetName());
	System.out.println(sheet.getLastRowNum());
	System.out.println("Before Upfating Cell data"+sheet.getRow(2).getCell(1));
	
	XSSFCell cell= sheet.getRow(2).getCell(1);
	cell.setCellValue("Test12343");
	filein.close();
	FileOutputStream fileOut=new FileOutputStream("F:\\FileRead.xlsx");
	//wb.write(fileOut);
	System.out.println("Updated data after write is done"+  cell.getStringCellValue());
	fileOut.close();
	
}
}
