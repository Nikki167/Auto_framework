package nikitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLmatching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String U=driver.getCurrentUrl();
		if(U.contains("http"))
		{
			System.out.println("TC passed");
		
		}
		else
		{
			System.out.println("Tc fail");
		}
		

	}

}
