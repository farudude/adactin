package Webdriver_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// wait
public class TC009 {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium tools\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");

//wait for a specific element to be loaded
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
wait.until(ExpectedConditions.elementToBeClickable
		(driver.findElement(By.name("Submit"))));
driver.findElement(By.name("Submit")).click();

// wait for the page to be loaded then display is implicitwait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));





}
}
