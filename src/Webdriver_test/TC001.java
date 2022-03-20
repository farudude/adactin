package Webdriver_test;
// Login Logout
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC001 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","F://STUDIES//Selenium Tools//chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://localhost/orangehrm-2.6/login.php");
    driver.findElement(By.name("txtUserName")).sendKeys("admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin");
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.linkText("Logout")).click();
    driver.close();
    }
}
