package WebDriver;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class TC_XL {
public static void main(String[] args) throws Exception{
	FileInputStream file= new FileInputStream("F:\\FileRead.xls");
	Workbook wb= Workbook.getWorkbook(file);
	Sheet st= wb.getSheet(0);
	
	int rowcount=st.getRows();
	System.out.println("ROWS=> "+rowcount);
	for(int i=1;i<rowcount;i++)
	{
	String empid= st.getCell(0,i).getContents();
	String name= st.getCell(1,i).getContents();
	String email= st.getCell(2,i).getContents();
	String no= st.getCell(3,i).getContents();
	
	System.out.println("Emp ID=>"+empid);
	System.out.println("Emp Name=>"+name);
	System.out.println("Emp Email=>"+email);
	System.out.println("Emp No.=>"+no);
	}
	
	
}
}
