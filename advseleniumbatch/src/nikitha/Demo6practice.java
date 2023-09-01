package nikitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6practice {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
String title = driver.getTitle();	
System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String src = driver.getPageSource();
	System.out.println(src);
	
}
}
