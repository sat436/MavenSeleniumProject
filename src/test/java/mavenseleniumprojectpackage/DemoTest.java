package mavenseleniumprojectpackage;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DemoTest {
  @Test
  public void Testcase1() {
	 
	System.out.print("Test case 1 started");
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
 	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.get("https://www.moviepass.com/");
	String expectedTitle="MoviePass | Watch New Movies in Theaters";
	String actualTitle= driver.getTitle();
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Test case passed");
	}
	else {
		System.out.println("Test case failed");
	}
  }
 

}
