package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;

public class TC_01 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","F://STUDIES//Selenium Tools//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://localhost/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(2000);
	
	driver.switchTo().frame("rightMenu");


	for(int i=1;i<=30;i=i+2)
	{
		driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
		Thread.sleep(2000);
	}
	//*[@id="standardView"]/table/tbody/tr[2]/td[1]/input
	/*for(int i=10;i<=30;i++)
	{
		
		String s=String.valueOf(i);  
		String s1=String.format("//input[@value='00%s']",s);
		System.out.println(s1);
		driver.findElement(By.xpath(s1)).click();
		i++;
	
	}*/
	driver.switchTo().defaultContent();
	driver.close();

}
}
