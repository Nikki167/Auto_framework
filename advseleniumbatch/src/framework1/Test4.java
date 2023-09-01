package framework1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void data1()
	{
		
	
		String key="webdriver.gecko.driver";
		String value="./Softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
	}

@Test
public void data2()
{
	


	String key="webdriver.chrome.driver";
	String value="./Softwares/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver= new ChromeDriver();
	}
}
