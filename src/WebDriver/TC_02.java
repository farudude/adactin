package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;

public class TC_02 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","F://STUDIES//Selenium Tools//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://localhost/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(2000);
	
	driver.switchTo().frame("rightMenu");
	//System.out.println(driver.findElement(By.name("loc_code")).getText());
	Select st = new Select(driver.findElement(By.name("loc_code")));
	List<WebElement> drpvalues=st.getOptions();
	for(WebElement val:drpvalues) {
	        System.out.println(val.getText());
	        Thread.sleep(2000);
	}
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
   driver.close();

}
}
