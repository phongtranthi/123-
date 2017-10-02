package webdriver_10_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG_DataProviders {
	WebDriver driver;
	
  @Test(dataProvider = "UserPass")
  //@Parameters({ "sUser", "sPass" })
  public void DataProvider_1(String sUser, String sPass) throws Exception {
	  driver.get("http://demo.guru99.com/v4/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.name("uid")).sendKeys(sUser);
	  driver.findElement(By.name("password")).sendKeys(sUser);
	  driver.findElement(By.name("btnLogin")).click();
  }
  
  @Test(dataProvider = "UserPass")
  //@Parameters({ "sUser", "sPass" })
  public void DataProvider_2(String sUser, String sPass) throws Exception {
	  driver.get("http://demo.guru99.com/v4/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.name("uid")).sendKeys(sUser);
	  driver.findElement(By.name("password")).sendKeys(sUser);
	  driver.findElement(By.name("btnLogin")).click();
  }
  
  @DataProvider(name="UserPass")
  public static Object[][]TestUserPass(Method method) {
	  Object[][] result=null;
    if(method.getName().equals("DataProvider_1")){
    	result= new Object[][] {{"mngr96534","zumEvyr"},{"mngr99224","mngr99224"}};
    }
    else if(method.getName().equals("DataProvider_2")){
    	result= new Object[][] {{"mngr96534","uqupEbe"},{"mngr99224","uqupEbe"}};
    }
    return result;
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "..\\Selenium_API\\BrowserDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterTest() {
	  driver.quit();
  }
}
