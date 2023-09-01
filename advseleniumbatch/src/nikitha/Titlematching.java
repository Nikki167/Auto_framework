package nikitha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlematching {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle();
	String s="login to facebook";
	System.out.println(s);
	if(s.equals(title))
{
	System.out.println("TC pass");
}
	else
	{
		System.out.println("Tc fail");
	}
	driver.close();
	
	}

}
