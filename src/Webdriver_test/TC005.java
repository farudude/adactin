package Webdriver_test;
//Alerts
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;


public class TC005 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F://STUDIES//Selenium Tools//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		//driver.findElement(By.name("txtPassword")).sendKeys("admin1");
		driver.findElement(By.name("Submit")).click();
		System.out.println(driver.switchTo().alert().getText());
        Alert a= driver.switchTo().alert();
        Thread.sleep(3000);
        a.dismiss();
        driver.findElement(By.name("txtPassword")).sendKeys("admin");
        driver.findElement(By.name("Submit")).click();
System.out.println(driver.getClass());
}
}
