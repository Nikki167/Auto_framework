package framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexec1 {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void test1(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
		}
	}

}
