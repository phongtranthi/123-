package webdriver_10_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
public class TestNG_Parameters {
	WebDriver driver;
	
	  @Test
	  @Parameters({ "sUser", "sPass" })
	  public void Test1(String sUser, String sPass) throws Exception {
		  driver.get("http://demo.guru99.com/v4/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.findElement(By.name("uid")).sendKeys(sUser);
		  Thread.sleep(1000);
		  driver.findElement(By.name("password")).sendKeys(sUser);
		  Thread.sleep(1000);
		  driver.findElement(By.name("btnLogin")).click();
	  }
	  
	  @Test
	  @Parameters({ "sUser", "sPass" })
	  public void Test2(String sUser, String sPass) throws Exception {
		  driver.get("http://demo.guru99.com/v4/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.findElement(By.name("uid")).sendKeys(sUser);
		  Thread.sleep(1000);
		  driver.findElement(By.name("password")).sendKeys(sUser);
		  Thread.sleep(1000);
		  driver.findElement(By.name("btnLogin")).click();
	  }
	  @BeforeMethod
	  public void beforeTest() {
		  driver = new FirefoxDriver();
	  }

	  @AfterMethod
	  public void afterTest() {
		  driver.quit();
	  }
}
