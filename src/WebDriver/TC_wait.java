package WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_wait {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium tools\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");

//wait until Login btn need to be loaded
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
driver.findElement(By.name("Submit")).click();

//wait untill empInfo: page to be loaded
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
System.out.println("Logout completed");
driver.close();

}
}



