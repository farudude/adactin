package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC001_Adactin {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium tools\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.navigate().to("https://adactinhotelapp.com/");
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("cooldude");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("passw0rd");
		 driver.findElement(By.xpath("//input[@name='login']")).click();
		// driver.findElement(By.xpath("//input[@class='search_combobox']")).click();
		 
		 
		 
	}
}
