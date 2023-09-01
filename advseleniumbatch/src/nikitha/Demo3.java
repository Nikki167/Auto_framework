package nikitha;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3
{
	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		FirefoxDriver d1=new FirefoxDriver();
		
		
		
	}
	
}
