package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class TC007_drop_down {
public static void main(String args[]) throws Exception{
System.setProperty("webdriver.gecko.driver", "F:\\STUDIES\\Selenium Tools\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
//Enter into frame
driver.switchTo().frame("rightMenu");
Select st = new Select(driver.findElement(By.name("loc_code")));
//st.selectByVisibleText("Emp. ID");
//st.selectByIndex(1);
st.selectByValue("0");
Thread.sleep(3000);
driver.findElement(By.name("loc_name")).sendKeys("0020");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.name("chkLocID[]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(3000);
//Exit from frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("Logout completed");
driver.close();



}
}