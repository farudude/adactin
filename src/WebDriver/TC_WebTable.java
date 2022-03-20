package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium Tools\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("F:\\Webtable.html");
		
		int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		int row_col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		
		System.out.println("ROWS==> "+row);
		System.out.println("COLUMN==> "+col);
		System.out.println("ROW_COLUMN==> "+row_col);
		
		String celldata= driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[3]/td[3]")).getText();
		 System.out.println(celldata);
		for(int i=1; i<=row;i++)
		{
			String data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
			System.out.println(data);
		}
		driver.close();
		
	}
}
 