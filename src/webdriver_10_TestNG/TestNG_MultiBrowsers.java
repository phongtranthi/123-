package webdriver_10_TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_MultiBrowsers {
	WebDriver driver;
	
	  @Test
	  @Parameters({ "browser","sUser", "sPass" })
	  public void Test1(String browser,String sUser, String sPass) throws Exception {
		  OpenBrowser(browser);
		  driver.get("http://demo.guru99.com/v4/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.findElement(By.name("uid")).sendKeys(sUser);
		  driver.findElement(By.name("password")).sendKeys(sUser);
		  driver.findElement(By.name("btnLogin")).click();
	  }
	  
	  public void OpenBrowser(String browser){
		  if(browser.equals("firefox")){
			  driver = new FirefoxDriver();
		  }
		  else if (browser.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver", "..\\Selenium_API\\BrowserDriver\\chromedriver.exe");
			  driver = new ChromeDriver();
		  }
		  else if (browser.equals("ie")){
			  System.setProperty("webdriver.ie.driver", "..\\Selenium_API\\BrowserDriver\\IEDriverServer.exe");
			  driver = new InternetExplorerDriver();
		  }		  
	  }
	  @AfterMethod
	  public void afterTest() {
		  driver.quit();
	  }
}
