package nikitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTitle {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 String title=driver.getTitle();
	 String S="login to facebook page";
	 System.out.println(S);
	 if(S.contains("face"))
	 {
		 System.out.println("Tc pass");
	 }
	 else
	 {
		 System.out.println("Tc fail");
	 }

	}

}
