package framework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExec {
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
			driver.findElement(By.id("email")).sendKeys("Nikitha");
			driver.findElement(By.id("pass")).sendKeys("manager");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("Nikitha");
			driver.findElement(By.id("pass")).sendKeys("manager");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
		}
	}

}
